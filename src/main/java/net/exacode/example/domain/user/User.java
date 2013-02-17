package net.exacode.example.domain.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import net.exacode.example.domain.security.PasswordEncoderService;
import net.exacode.example.infrastructure.Invariant;

import org.springframework.beans.factory.annotation.Autowired;

@NamedQueries({
		@NamedQuery(name = "User.findByEmail", query = "from User u where u.email = :email"),
		@NamedQuery(name = "User.findByLogin", query = "from User u where u.login = :login"),
		@NamedQuery(name = "User.findByLoginOrEmail", query = "from User u where u.email = :loginOrEmail or u.login = :loginOrEmail") })
@SuppressWarnings("serial")
@Entity
@Table(name = "users")
public class User implements Serializable {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Version
	@Column(name = "version")
	private Long version;

	@Column(name = "email")
	private String email;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "role_id", unique = true) })
	private final List<Role> roles = new ArrayList<Role>();

	@Column(name = "creation_time")
	private final Date creationTime = new Date();

	@Column(name = "modification_time")
	private final Date modificationTime = new Date();

	@Transient
	@Autowired
	private PasswordEncoderService passwordEncoderService;

	User() {

	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Invariant.matchesPattern(email, Invariant.EMAIL_PATTERN,
				"User email must match email regex pattern");
		this.email = email;
	}

	public void setLogin(String login) {
		Invariant.longerThan(login, 3, "User login must be longer than 3");
		Invariant.matchesPattern(login, Invariant.LOGIN_PATTERN,
				"User login must consist of simple characters");
		this.login = login;
	}

	public String getEncodedPassword() {
		return password;
	}

	public void setPassword(String password) {
		String hashedPassword = passwordEncoderService.encodePassword(password);
		Invariant.ofLength(hashedPassword, 32,
				"MD5 hashed password should be 32 characters long");
		this.password = hashedPassword;
	}

	public List<Role> getRoles() {
		return Collections.unmodifiableList(roles);
	}

	public void addRole(Role role) {
		roles.add(role);
	}

	public List<Authority> getAuthorities() {
		List<Authority> authorities = new ArrayList<Authority>();
		for (Role role : roles) {
			authorities.addAll(role.getAuthorities());
		}
		return authorities;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", login=" + login + "]";
	}

	// @PreUpdate
	// protected void updateModificationTime() {
	// this.modificationTime = new Date();
	// }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
