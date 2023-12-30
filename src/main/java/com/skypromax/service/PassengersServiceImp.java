package com.skypromax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skypromax.entity.Passengers;
import com.skypromax.repository.PassengersRepository;
@Service
public class PassengersServiceImp implements PassengersService {

	
	@Autowired
	private PassengersRepository passengersrepo;
	
	@Override
	public void savepassengers(Passengers passengers) {
		passengersrepo.save(passengers);
		

	}

}
