package br.com.aplicacaum.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "cliente", uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }) })
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "username", length = 50)
	@JsonProperty(value = "username")
	private String username;
	@Column(name = "email", length = 100)
	@JsonProperty(value = "email")
	private String email;
	@Column(name = "telephone")
	@JsonProperty(value = "age")
	private Integer age;

	public Users(Integer id, String username, String email, Integer age) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.age = age;
	}

	public Users() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
