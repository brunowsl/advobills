package br.com.api.advobills.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "tenant")
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    private String name;
    @Column(name = "owner", columnDefinition = "boolean default false", length = 1)
    private Boolean owner;
    @Size(max = 11)
    private String cpf;
    @Size(max = 20)
    private String rg;
    @Size(max = 50)
    private String email;
    @Size(max = 20)
    private String phone;

    @ManyToOne
    private Apartment apartment;

}