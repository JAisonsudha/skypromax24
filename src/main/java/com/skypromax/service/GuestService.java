package com.skypromax.service;

import com.skypromax.entity.Guest;

public interface GuestService {
	
	public void saveguestdata(Guest guest);
	public void deleteguest(long id);

}
