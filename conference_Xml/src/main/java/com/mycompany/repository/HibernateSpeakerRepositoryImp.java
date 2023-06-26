package com.mycompany.repository;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.mycompany.model.Speaker;

@Repository("SpeakerRepository")
public class HibernateSpeakerRepositoryImp implements SpeakerRepository {

	
	
	public HibernateSpeakerRepositoryImp() {
		super();
		
	}

	@Override
	public List<Speaker> findAll() {
		
		List<Speaker> speakers=new ArrayList<Speaker>();
		
		speakers.add(new Speaker("vandana","chilkuru"));
		return speakers;
	}

}
