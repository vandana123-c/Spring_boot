package com.mycompany.repository;

import java.util.*;
import com.mycompany.model.Speaker;

public class HibernateSpeakerRepositoryImp implements SpeakerRepository {

	@Override
	public List<Speaker> findAll() {
		
		List<Speaker> speakers=new ArrayList<Speaker>();
		
		speakers.add(new Speaker("vandana","chilkuru"));
		return speakers;
	}

}
