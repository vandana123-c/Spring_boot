package com.mycompany.conference.repository;

import java.util.List;

import com.mycompany.conference.model.Registration;
import com.mycompany.conference.model.RegistrationReport;

public interface Registerrepository {

	Registration save(Registration register);

	List<RegistrationReport> findReports();

}