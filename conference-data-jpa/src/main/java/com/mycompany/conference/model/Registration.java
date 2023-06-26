package com.mycompany.conference.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Registrations")
public class Registration {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

    @NotEmpty
    private String name;
    
    @JsonManagedReference
    @OneToMany(mappedBy="registration",cascade=CascadeType.ALL)
    List<Course> course=new ArrayList<>();
    

    public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
    
}
