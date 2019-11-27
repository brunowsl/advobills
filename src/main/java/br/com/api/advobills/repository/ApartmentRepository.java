
package br.com.api.advobills.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.advobills.model.Apartment;

/**
 * ApartmentRepository
 */
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

}