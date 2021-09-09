package com.consolecode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.consolecode.model.Persona;

@Repository
public interface IPersonaRepository extends CrudRepository<Persona, Integer> {

}
