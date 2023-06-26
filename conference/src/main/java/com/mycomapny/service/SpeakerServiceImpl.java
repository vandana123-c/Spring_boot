package com.mycomapny.service;
import java.util.List;

import com.mycompany.model.Speaker;
import com.mycompany.repository.*;

public class SpeakerServiceImpl implements SpreakerService {
	
	private SpeakerRepository rep=new HibernateSpeakerRepositoryImp();

	@Override
	public List<Speaker> findAll() {
		return rep.findAll();
		 
	}
	
		
	

}
