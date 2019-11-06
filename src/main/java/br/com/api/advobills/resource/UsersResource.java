package br.com.api.advobills.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.advobills.model.Users;
import br.com.api.advobills.repository.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersResource {
    
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping
    public List<Users> listUsers() {
        return usersRepository.findAll();
    }

}