package com.consolecode.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.consolecode.model.Pais;

@Repository
public interface IPaisRepository extends CrudRepository<Pais, Integer> {

}
