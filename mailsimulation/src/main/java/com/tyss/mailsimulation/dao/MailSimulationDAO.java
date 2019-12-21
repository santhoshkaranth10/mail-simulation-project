package com.tyss.mailsimulation.dao;

import com.tyss.mailsimulation.dto.UserInfo;

public interface MailSimulationDAO
{
	public boolean userRegistration(UserInfo userinfo);
	public UserInfo login(String email,String Password);
	public boolean changePassword(UserInfo info);

}
