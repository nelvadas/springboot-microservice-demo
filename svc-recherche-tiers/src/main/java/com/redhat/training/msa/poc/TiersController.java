package com.redhat.training.msa.poc;

import org.springframework.web.bind.annotation.RestController;

import com.redhat.training.msa.poc.data.ITiersDataRepository;
import com.redhat.training.msa.poc.model.Tiers;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/tiers")

public class TiersController {
	
	@Autowired
	private ITiersDataRepository repository;
	
	
	
	public TiersController(){
		
	}
	
    
    @RequestMapping( path="/{ref}",
    		         method = RequestMethod.GET,
    		         produces = {MediaType.APPLICATION_JSON_VALUE} 
    		        )
    public Tiers findByRef(@PathVariable(value = "ref") String ref) {
    	 Tiers tiers= repository.findByRef(ref);
    	 //custom injection of data.
    	 System.out.println("findByRef:"+tiers);
    	 return tiers;
    }
 
    
    
    @RequestMapping("/")
    public Collection<Tiers> findAll() {
        return repository.findAll(); 
    }
 
    
    
}
