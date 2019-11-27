
package br.com.api.advobills.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.advobills.model.Tenant;

/**
 * TenantRepository
 */
public interface TenantRepository extends JpaRepository<Tenant, Long> {

}