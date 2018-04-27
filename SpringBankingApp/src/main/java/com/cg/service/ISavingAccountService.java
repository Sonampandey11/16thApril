package com.cg.service;

public interface ISavingAccountService {
	public float transaction();
	public void deposit(float depositAmount);
	public void withdraw(float withdrawlamount);
	public void deleteAccount();
}
