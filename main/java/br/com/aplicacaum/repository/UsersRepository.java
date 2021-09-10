package br.com.aplicacaum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.aplicacaum.dto.UsersDtoMinimunResponse;
import br.com.aplicacaum.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
	@Query(value="select username,age from users where age in (select min(age) from users)", nativeQuery=true)
	public UsersDtoMinimunResponse findByAgeMin();

}
