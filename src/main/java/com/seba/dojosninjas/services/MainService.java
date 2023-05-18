package com.seba.dojosninjas.services;

import com.seba.dojosninjas.models.Dojo;
import com.seba.dojosninjas.models.Ninja;
import com.seba.dojosninjas.repositories.DojoRepo;
import com.seba.dojosninjas.repositories.NinjaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainService {
    @Autowired
    private DojoRepo dojoRepo;
    @Autowired
    private NinjaRepo ninjaRepo;

    public Dojo createDojo(Dojo dojo){
        return dojoRepo.save(dojo);
    }

    public Ninja createNinja(Ninja ninja){
        return ninjaRepo.save(ninja);
    }

    public List<Dojo> todosDojos(){
        return dojoRepo.findAll();
    }

    public List<Ninja> todosNinjas(){
        return ninjaRepo.findAll();
    }

    public Dojo buscarDojo(Long id){
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        return optionalDojo.orElse(null);
    }
}
