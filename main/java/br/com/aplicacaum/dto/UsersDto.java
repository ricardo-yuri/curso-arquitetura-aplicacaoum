package br.com.aplicacaum.dto;

public class UsersDto {

	private Integer id;
	private String username;
	private String email;
	private Integer age;

	public UsersDto() {

	}

	public UsersDto(Integer id, String username, String email, Integer age) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.age = age;
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
