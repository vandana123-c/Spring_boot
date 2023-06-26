package com.mycompany.conference.service;

import java.util.List;

import com.mycompany.conference.model.Registration;
import com.mycompany.conference.model.RegistrationReport;

public interface RegisterService {

	public Registration save(Registration register);

	List<RegistrationReport> findReports();

}