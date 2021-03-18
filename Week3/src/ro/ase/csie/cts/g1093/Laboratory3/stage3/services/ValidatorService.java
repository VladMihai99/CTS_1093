package ro.ase.csie.cts.g1093.Laboratory3.stage3.services;

import ro.ase.csie.cts.g1093.Laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.Laboratory3.exceptions.InvalidPriceException;

public class ValidatorService implements ValidatorInterface {

	public void validatePrice(float price) throws InvalidPriceException {
		if(price <= 0)
			throw new InvalidPriceException();
		
	}

	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException {
		if(accountAgeInYears < 0 ) {
			throw new InvalidAccountAgeException();
		}
		
	}

}
