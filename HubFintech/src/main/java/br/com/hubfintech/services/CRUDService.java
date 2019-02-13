package br.com.hubfintech.services;

import br.com.hubfintech.domain.Conta;

public interface CRUDService<T> {
	Iterable<Conta> listAll();

	T getById(Integer id);

	T saveOrUpdate(T domainObject);

	void delete(Integer id);
}
