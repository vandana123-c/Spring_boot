package com.mycompany.service;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.model.Speaker;
import com.mycompany.repository.*;

@Service("SpeakerService")

public class SpeakerServiceImpl implements SpreakerService {
	
	//private SpeakerRepository rep=new HibernateSpeakerRepositoryImp();

	private SpeakerRepository rep;
	
	@Override
	public List<Speaker> findAll() throws Exception {
		return rep.findAll();
		 
	}
	@PostConstruct
	private void initializer() {
		System.out.println("called after constructor");
	}
	
	@Autowired
	public  SpeakerServiceImpl(SpeakerRepository rep) {
		System.out.println("SpeakerServiceImpl repository args constructor");
		this.rep = rep;
	}


	public SpeakerServiceImpl() {
		System.out.println("SpeakerServiceImpl no args constructor");
		// TODO Auto-generated constructor stub
	}


	public SpeakerRepository getRep() {
		return rep;
	}
	//@Autowired
	public void setRep(SpeakerRepository rep) {
		System.out.println("SpeakerServiceImpl setter");
		this.rep = rep;
	}
	
	
	
		
	

}
