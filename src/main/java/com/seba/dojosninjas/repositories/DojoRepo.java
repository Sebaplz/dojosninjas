package com.seba.dojosninjas.repositories;

import com.seba.dojosninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {

    List<Dojo> findAll();
}
