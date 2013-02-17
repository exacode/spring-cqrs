package net.exacode.example.domain.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import net.exacode.example.infrastructure.Invariant;

/**
 * Describes a role of a user. Roles can group authorities.
 * 
 * @author pmendelski
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "roles")
public class Role implements Serializable {
	@Id
	@Column(name = "role_id")
	@SequenceGenerator(name = "roles_seq_gen", sequenceName = "roles_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roles_seq_gen")
	private Long id;

	@Column(name = "name")
	private String name;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "role_authorities", joinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "role_id") }, inverseJoinColumns = { @JoinColumn(name = "authority_id", referencedColumnName = "authority_id", unique = true) })
	private final List<Authority> authorities = new ArrayList<Authority>();

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Invariant.notNullAndNotEmpty(name, "Role name must not be empty");
		this.name = name;
	}

	public List<Authority> getAuthorities() {
		return Collections.unmodifiableList(authorities);
	}

	public void addAuthority(Authority authority) {
		authorities.add(authority);
	}

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
		Role other = (Role) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Role [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", authorities=");
		builder.append(authorities);
		builder.append("]");
		return builder.toString();
	}

}