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

import br.com.api.advobills.model.Apartment;
import br.com.api.advobills.repository.ApartmentRepository;

/**
 * ApartmentResource
 */
@RestController
@RequestMapping("/apartments")
public class ApartmentResource {

    @Autowired
    private ApartmentRepository apartmentRepository;

    @GetMapping
    public List<Apartment> listUsers() {
        return apartmentRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody Apartment apartment) {
        apartmentRepository.save(apartment);
    }

    
}