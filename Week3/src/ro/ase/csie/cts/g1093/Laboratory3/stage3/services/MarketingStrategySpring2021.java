package ro.ase.csie.cts.g1093.Laboratory3.stage3.services;

public class MarketingStrategySpring2021 implements MarketingInterface {

	public float getFidelityDiscount(int accountAgeInYears) {
		return (accountAgeInYears > MAX_ACCOUNT_AGE) ? 
				MAX_FIDELITY_DISCOUNT : (float)accountAgeInYears/100;
	}

}
