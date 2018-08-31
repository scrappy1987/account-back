package com.qa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;
import com.qa.service.IAccountService;

@Service
public class AccountService implements IAccountService {
	
	@Autowired
	AccountRepository accountRepository;

	public Account getAccountById(Integer accountId) {
		return accountRepository.getOne(accountId);
	}

	public void saveAccount(Account account) {
		accountRepository.save(account);
		
	}

	public List<Account> getAllAccount() {
		return accountRepository.findAll();
	}


}
