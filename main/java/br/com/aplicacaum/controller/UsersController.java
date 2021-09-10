package br.com.aplicacaum.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.aplicacaum.dto.ResponseError;
import br.com.aplicacaum.dto.UsersDtoRequest;
import br.com.aplicacaum.dto.UsersDtoResponse;
import br.com.aplicacaum.entity.Users;
import br.com.aplicacaum.repository.UsersRepository;

@ResponseBody
@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UsersRepository repository;

	public List<Users> getLista() {
		return repository.findAll();
	}
	
	public ResponseEntity<?> save(@Valid @RequestBody UsersDtoRequest request){
		try {
			Users u = request.getTransformDtoUsers();
			Users resp = repository.save(u);
			if(resp==null) {
				throw new Exception("Error de Gravacao");
			}
			UsersDtoResponse response = new UsersDtoResponse();
			
			return ResponseEntity.status(200).body(response.getTransformeUsersDto(resp));
		} catch (Exception ex) {
			ResponseError response = new ResponseError("error",ex.getMessage());
			return ResponseEntity.status(500).body(response);
		}
	}

}
