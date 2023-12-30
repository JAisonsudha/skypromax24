package com.skypromax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skypromax.entity.Guest;
import com.skypromax.repository.GuestRepository;
@Service
public class GuestServiceImp implements GuestService {
	
	@Autowired
	private GuestRepository guestrepo;
	

	@Override
	public void saveguestdata(Guest guest) {
		guestrepo.save(guest);
	}


	@Override
	public void deleteguest(long id) {
		guestrepo.deleteById(id);
		
	}

}
