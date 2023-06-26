package com.mycompany.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.model.Speaker;
import com.mycompany.repository.*;

@Service("SpeakerService")
public class SpeakerServiceImpl implements SpreakerService {
	
	//private SpeakerRepository rep=new HibernateSpeakerRepositoryImp();

	private SpeakerRepository SpeakerRepository;
	
	@Override
	public List<Speaker> findAll() {
		return SpeakerRepository.findAll();
		 
	}
	
	

	public SpeakerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SpeakerServiceImpl(SpeakerRepository rep) {
		System.out.println("parameter constructor");
		this.SpeakerRepository = rep;
	}

//autowire by type
//	public void setrepy(SpeakerRepository rep) {
//		System.out.println("SpeakerServiceImpl setter");
//		this.rep = rep;
//	}
//	
	//autowire by name
	public void setSpeakerRepository(SpeakerRepository rep) {
		System.out.println("SpeakerServiceImpl setter");
		this.SpeakerRepository = rep;
	}
	
		
	

}
