package com.skypromax.utilitry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;




@Component
public class SkypromaxMailImp implements SkypromaxMial {

	@Autowired
	private JavaMailSender sender;
	
	@Override
	public void Ticketmail( String to,  String from, String sub) {
	
		SimpleMailMessage s= new SimpleMailMessage();
		s.setTo(to);
		s.setFrom(from);
		s.setSubject(sub);
		sender.send(s);

	}

}
