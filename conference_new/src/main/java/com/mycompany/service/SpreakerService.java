package com.mycompany.service;

import java.util.List;

import com.mycompany.model.Speaker;

public interface SpreakerService {
	
	public List<Speaker> findAll() throws Exception;

}