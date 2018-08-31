package com.qa.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistence.domain.Account;
import com.qa.service.IAccountService;


@RequestMapping("/account")
@RestController
public class AccountController {
	
	@Autowired
	IAccountService accountService;

	@RequestMapping("get/{id}")
	public Account getAccountById(@PathVariable Integer id) {
		return accountService.getAccountById(id);
	}
	
	@RequestMapping("/getall")
	public List<Account> getAllAccounts() {
		return accountService.getAllAccount();
	}
	
	@RequestMapping(value= "save", method= RequestMethod.POST)
	public void saveAccount(@RequestBody Account account) {
		accountService.saveAccount(account);
	}
}
