package br.com.aplicacaum.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import br.com.aplicacaum.entity.Users;

public class UsersDtoRequest {

	private Integer id;
	@Pattern(regexp = "[A-z a-z]{2,50}", message = "Nome Invalído")
	private String username;
	@Email(message = "Não está de acordo com um email valido")
	@NotBlank(message = "preencha o email")
	private String email;
	@Min(value = 0, message = "idade minima e zero")
	@Max(value = 130, message = "idade maxima não pode ser maior que 130")
	@NotNull(message = "Idade nao pode ser Nullo")
	private Integer age;

	public UsersDtoRequest() {

	}

	public UsersDtoRequest(Integer id, @Pattern(regexp = "[A-z a-z]{2,50}", message = "Nome Invalído") String username,
			@Email(message = "Não está de acordo com um email valido") @NotBlank(message = "preencha o email") String email,
			@Min(value = 0, message = "idade minima e zero") @Max(value = 130, message = "idade maxima não pode ser maior que 130") @NotNull(message = "Idade nao pode ser Nullo") Integer age) {
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

	public Users getTransformDtoUsers() {

		Users users = new Users();

		users.setUsername(getUsername());
		users.setAge(getAge());
		users.setEmail(getEmail());
		
		return users;
	}

}
