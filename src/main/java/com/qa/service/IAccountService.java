package com.qa.service;

import java.util.List;

import com.qa.persistence.domain.Account;

public interface IAccountService {
    Account getAccountById(Integer trainerId);
    void saveAccount(Account account);
    List<Account> getAllAccount();
}
