package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
    @Column
    private String firstName;
    @Column
    private String surname;
    @Column
    private String accountNum;
    
    public Account() 
    {
    	
    }
    
    public Account(String firstName, String surname, String accountNum) 
    {
    	this.firstName = firstName;
    	this.surname = surname;
    	this.accountNum = accountNum;
    }
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
    
}
