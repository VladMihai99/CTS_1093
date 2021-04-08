package ro.ase.csie.cts.g1093.assignment;

import ro.ase.csie.cts.g1093.assignment.exceptions.InvalidLoanException;
import ro.ase.csie.cts.g1093.assignment.interfaces.CalculateMonthlyRateInterface;

public class Account implements CalculateMonthlyRateInterface {
	
	public double loanValue, rate;
	public int daysActive;
    AccountType accountType;
    public static final float BrokerFee = .0125f;
    public static final int DaysInAYear = 365;
    
	public Account(double loanValue, double rate,int daysActive, AccountType accountType) throws InvalidLoanException {
		super();
		if(loanValue < 0) {
			throw new InvalidLoanException();
		}
		this.loanValue = loanValue;
		
		if(rate < 0) {
			throw new InvalidLoanException();
		}		
		this.daysActive = daysActive;
		this.rate = rate;
		this.accountType = accountType;
	}

	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}

	public double getRate() {
		System.out.println("The rate is " + rate);
		return this.rate;
	}

	public void setloanValue(double loanValue) throws InvalidLoanException {
		if (loanValue < 0) {
			throw new InvalidLoanException();
		}
		this.loanValue = loanValue;
	}

	@Override
	public String toString() {
		return "Account [loanValue=" + loanValue + ", rate=" + rate + ", daysActive=" + daysActive + ", accountType=" + accountType + "]";
	}

	public static double interestFee(Account account){
		return Math.pow(account.rate, (account.daysActive / DaysInAYear));
	}
	
	public static double finalLoan(Account account) {
		return interestFee(account)*account.loanValue;
	}
	

	public static double calculatePremiumSuperPremiumFee(Account[] accounts) {
		double totalFee = 0.0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].accountType == AccountType.PREMIUM || accounts[i].accountType == AccountType.SUPER_PREMIUM)
				totalFee += BrokerFee * (finalLoan(accounts[i])- accounts[i].loanValue);
		}
		return totalFee;
	}

	@Override
	public double monthlyRateComputation() {
		return loanValue * rate;
	}
}
