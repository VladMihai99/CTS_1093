package ro.ase.csie.cts.g1093.Laboratory3.stage2;

public enum ProductType {
    NEW(0), DISCOUNT(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
	
	private final float discountValue;
	
	private ProductType(float discount)
	{
		this.discountValue = discount;
	}

	public float getDiscount() {
		return this.discountValue;
	}
	
}