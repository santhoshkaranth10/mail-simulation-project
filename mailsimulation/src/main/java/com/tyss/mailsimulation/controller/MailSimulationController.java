package com.tyss.mailsimulation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.mailsimulation.dto.UserInfo;
import com.tyss.mailsimulation.service.MailSimulationService;

@RestController
public class MailSimulationController 
{
	@Autowired
	private MailSimulationService service;
	
	@PostMapping(path="/register",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	 public  boolean userRegistration(@RequestBody UserInfo userInfo) {
		if(service.userRegistration(userInfo)) {
			return true;
		}else {
			return false;
		}
	 }//end of userRegistration()
	
	@PostMapping(path="/login",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public UserInfo login(@RequestBody UserInfo info)
	{
		UserInfo info1=service.login(info.getEmail(), info.getPassword());
		if(info1!=null) {
			return info1;
		}else {
			return null;
		}
	}//end of login()
	@PutMapping(path="/changepassword",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean changePassword(@RequestBody UserInfo info)
	{
		if(service.changePassword(info)) {
			return true;
		}else {
			return false;
		}
	}//end of login()

}
