package com.skypromax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skypromax.entity.Passengers;

public interface PassengersRepository extends JpaRepository<Passengers,Long> {

}
