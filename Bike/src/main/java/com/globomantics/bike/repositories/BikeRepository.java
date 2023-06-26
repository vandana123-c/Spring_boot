package com.globomantics.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globomantics.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
