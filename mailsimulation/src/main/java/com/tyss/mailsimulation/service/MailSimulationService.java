package com.tyss.mailsimulation.service;

import com.tyss.mailsimulation.dto.UserInfo;

public interface MailSimulationService
{
	public boolean userRegistration(UserInfo userinfo);
	public UserInfo login(String email,String password);
	public boolean changePassword(UserInfo info);

}
