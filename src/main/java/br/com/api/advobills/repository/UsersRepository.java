package br.com.api.advobills.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.advobills.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
    
}