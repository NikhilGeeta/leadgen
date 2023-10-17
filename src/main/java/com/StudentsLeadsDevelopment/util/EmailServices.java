package com.StudentsLeadsDevelopment.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServices {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void Email(String to,String sub,String msg) {
		SimpleMailMessage a = new SimpleMailMessage();
		a.setTo(to);
		a.setSubject(sub);
		a.setText(msg);
		
		javaMailSender.send(a);
	}
}
