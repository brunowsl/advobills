package br.com.api.advobills.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.advobills.model.Condominio;
import br.com.api.advobills.repository.CondominioRepository;

/**
 * CondominioResource
 */
@RestController
@RequestMapping("/condominios")
public class CondominioResource {


    @Autowired
    private CondominioRepository condominioRepository;

    @GetMapping
    public List<Condominio> listUsers() {
        return condominioRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody Condominio condominio) {
        condominioRepository.save(condominio);
    }

    
}