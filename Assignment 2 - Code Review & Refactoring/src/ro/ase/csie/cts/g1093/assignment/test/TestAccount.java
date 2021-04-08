package ro.ase.csie.cts.g1093.assignment.test;

import ro.ase.csie.cts.g1093.assignment.Account;
import ro.ase.csie.cts.g1093.assignment.AccountType;
import ro.ase.csie.cts.g1093.assignment.exceptions.InvalidLoanException;

public class TestAccount {

	public static void main(String[] args) throws InvalidLoanException {
		
		Account account1= new Account(5,89.8,560,AccountType.PREMIUM);
		Account account2 = new Account(5,89.8,50,AccountType.SUPER_PREMIUM);
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		Account[] accounts = new Account[2];
		accounts[0]=(account1);
		accounts[1]=(account2);
		System.out.println(Account.calculatePremiumSuperPremiumFee(accounts ));
	}

}