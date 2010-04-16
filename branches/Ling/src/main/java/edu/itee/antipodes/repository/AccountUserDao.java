package edu.itee.antipodes.repository;

import java.util.List;

import edu.itee.antipodes.domain.AccountUser;

public interface AccountUserDao {

	public List<AccountUser> getAccountUserList();
	
	public void saveAccountUser(AccountUser accUser);
	
	public void dropAccountUser(AccountUser accUser);

}
