package com.tyss.mailsimulation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.mailsimulation.dao.MailSimulationDAO;
import com.tyss.mailsimulation.dto.UserInfo;

@Service
public class MailSimulationServiceImpl  implements MailSimulationService
{

	@Autowired
	private MailSimulationDAO dao;
	
	@Override
	public boolean userRegistration(UserInfo userinfo) {
		
		return dao.userRegistration(userinfo);
	}

	@Override
	public UserInfo login(String email, String password) {
		
		return dao.login(email, password);
	}

	@Override
	public boolean changePassword(UserInfo info) {
		
		return dao.changePassword(info);
	}

}
