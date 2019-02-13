package br.com.hubfintech.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.hubfintech.domain.Conta;

@RepositoryRestResource
public interface ContaRepository extends CrudRepository<Conta, Integer> {

	

}
