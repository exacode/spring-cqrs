package net.exacode.example.domain.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import net.exacode.example.infrastructure.Invariant;

/**
 * Describes an authority of an user/role. Authorities can be grouped by roles.
 * 
 * @author pmendelski
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "authorities")
public class Authority implements Serializable {
	@Id
	@Column(name = "authority_id")
	@SequenceGenerator(name = "authorities_seq_gen", sequenceName = "authorities_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authorities_seq_gen")
	private Long id;

	@Column(name = "name")
	private String name;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Invariant.notNullAndNotEmpty(name, "Authority name must not be empty");
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Authority [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}