package com.codingdojo.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosninjas.models.Dojo;
import com.codingdojo.dojosninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	private final DojoRepository dojoRepo;
    
    public DojoService(DojoRepository dojoRepo) {
        this.dojoRepo = dojoRepo;
    }
    // returns all dojos
    public List<Dojo> getAll() {
        return dojoRepo.findAll();
    }
    // creates a dojo
    public Dojo create(Dojo dojo) {
    	System.out.println(dojo.getId());
        return dojoRepo.save(dojo);
    }
    // retrieves a dojo
    public Dojo findID(Long id) {
        Optional<Dojo> result = dojoRepo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
}
