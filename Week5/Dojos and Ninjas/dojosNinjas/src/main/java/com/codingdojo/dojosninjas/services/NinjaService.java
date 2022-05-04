package com.codingdojo.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosninjas.models.Dojo;
import com.codingdojo.dojosninjas.models.Ninja;
import com.codingdojo.dojosninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	private final NinjaRepository ninjaRepo;
    
    public NinjaService(NinjaRepository ninjaRepo) {
        this.ninjaRepo = ninjaRepo;
    }
    // returns all ninjas
    public List<Ninja> getAll() {
        return ninjaRepo.findAll();
    }
    // creates a ninja
    public Ninja create(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }
    // retrieves a dojo
    public Ninja find(Long id) {
        Optional<Ninja> result = ninjaRepo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
    public List<Ninja> byDojo(Dojo dojo) {
    	return ninjaRepo.findAllByDojo(dojo);
    }
}
