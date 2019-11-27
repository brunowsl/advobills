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

import br.com.api.advobills.model.Tenant;
import br.com.api.advobills.repository.TenantRepository;

/**
 * TenantResource
 */
@RestController
@RequestMapping("/tenants")
public class TenantResource {

    @Autowired
    private TenantRepository tenantRepository;

    @GetMapping
    public List<Tenant> listUsers() {
        return tenantRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveUser(@RequestBody Tenant tenant) {
        tenantRepository.save(tenant);
    }

}