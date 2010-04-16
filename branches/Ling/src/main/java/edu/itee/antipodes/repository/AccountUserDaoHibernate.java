package edu.itee.antipodes.repository;

import java.util.Collections;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.itee.antipodes.domain.AccountUser;

public class AccountUserDaoHibernate extends HibernateDaoSupport implements AccountUserDao {

	public AccountUser getUserById(int id){
		return (AccountUser)getHibernateTemplate().get(AccountUser.class, id);
	}
	
	public void dropAccountUser(AccountUser accUser) {
		Object record = getHibernateTemplate().load(AccountUser.class, accUser.getUserID());
        getHibernateTemplate().delete(record);
    }

	public List<AccountUser> getAccountUserList() {
		return getHibernateTemplate().find("from AccountUser");
		//.find() returns a list
	}

	public void saveAccountUser(AccountUser accUser) {
		getHibernateTemplate().saveOrUpdate(accUser);

		
	}

}
