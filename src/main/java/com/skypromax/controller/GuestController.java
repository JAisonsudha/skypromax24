package com.skypromax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skypromax.entity.Guest;
import com.skypromax.entity.Passengers;
import com.skypromax.service.GuestService;
import com.skypromax.service.PassengersService;
import com.skypromax.utilitry.SkypromaxMial;


@Controller
public class GuestController {
	
	@Autowired
	private SkypromaxMial mails;
	
	@Autowired
	private PassengersService passengersserv;
	
	@Autowired
	private GuestService guestserv;
	
	@RequestMapping("/shows")
	public String shows() {
		return "shows";
		
	}
	
	@RequestMapping("/savedata")
	public String saveguest(Guest guest,Model model)
	{
		guestserv.saveguestdata(guest);
		model.addAttribute("guest",guest);
		return "passengersinfo";
		
		
	}
	
	@RequestMapping("/convert")
	public String savepasse(Passengers passengers,@RequestParam("id")long id)
	{
		passengersserv.savepassengers(passengers);
		mails.Ticketmail("passengers.getMail()","hi","WELCOME TO SKYPROMAX We wish you a pleasant journey and hope you have a wonderful experience on board.Thank you for choosing SKYPROMAX. We look forward to serving you and ensuring your comfort throughout your flight");
		guestserv.deleteguest(id);
		return "shows";
	}

}
