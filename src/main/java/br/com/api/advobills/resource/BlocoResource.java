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

import br.com.api.advobills.model.Bloco;
import br.com.api.advobills.repository.BlocoRepository;

/**
 * BlocoResource
 */
@RestController
@RequestMapping("/blocos")
public class BlocoResource {


    @Autowired
    private BlocoRepository blocoRepository;

    @GetMapping
    public List<Bloco> listUsers() {
        return blocoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody Bloco Bloco) {
        blocoRepository.save(Bloco);
    }

    
}