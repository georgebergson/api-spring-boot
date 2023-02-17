package br.com.spring.api.springapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.spring.api.springapi.model.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {
    
}
