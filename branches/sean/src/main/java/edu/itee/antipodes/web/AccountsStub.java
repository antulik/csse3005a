package edu.itee.antipodes.web;

import java.util.HashMap;
import java.util.Map;

public class AccountsStub implements AccountsDao{
    private long id = 0;
    private Map<Long, Account> accounts = new HashMap<Long, Account>();

    public void createOrUpdateAccount(Account account) {
        if (account.getId() == -1) {
            id++;
            account.setId(id);
        }
        accounts.put(new Long(account.getId()), account);
        System.out.println("SAVE: " + account);
    }

    public Account[] findAccounts() {
        Account[] a = accounts.values().toArray(new Account[] {});
        System.out.println("Returning " + a.length + " account(s):");
        for (int i = 0; i < a.length; i++) {
            System.out.println(" > " + a[i]);
        }
        return a;
    }

    public Account readAccount(Long id) {
        return accounts.get(id);
    }

}
