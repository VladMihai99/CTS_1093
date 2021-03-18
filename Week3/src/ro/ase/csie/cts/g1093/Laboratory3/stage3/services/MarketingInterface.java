package ro.ase.csie.cts.g1093.Laboratory3.stage3.services;

public interface MarketingInterface {
	public final int MAX_ACCOUNT_AGE = 10;
	public final float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	public float getFidelityDiscount(int accountAgeInYears);
}