package com.redhat.training.msa.poc.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.redhat.training.msa.poc.model.Tiers;

public interface ITiersDataRepository extends MongoRepository<Tiers, String> {
	
	public Tiers findByRef(String ref);
	public List<Tiers> findAll();
	

}
