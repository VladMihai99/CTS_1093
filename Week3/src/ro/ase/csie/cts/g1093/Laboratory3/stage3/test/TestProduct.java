package ro.ase.csie.cts.g1093.Laboratory3.stage3.test;

import java.util.ArrayList;

import ro.ase.csie.cts.g1093.Laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.Laboratory3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1093.Laboratory3.stage3.Product;
import ro.ase.csie.cts.g1093.Laboratory3.stage3.ProductType;
import ro.ase.csie.cts.g1093.Laboratory3.stage3.services.MarketingStrategySpring2021;
import ro.ase.csie.cts.g1093.Laboratory3.stage3.services.ValidatorService;

public class TestProduct {
	
	public static ArrayList<Object> services = new ArrayList<>();
	
	public static void startup() {
		services.add(new MarketingStrategySpring2021());
		services.add(new ValidatorService());
	}

	public static void main(String[] args) {
		
		startup();
		
		Product product = new Product(new MarketingStrategySpring2021(), new ValidatorService());
		float finalPrice = 0;
		try {
			finalPrice = product.getFinalPrice(ProductType.DISCOUNT, 100, 12);
			System.out.println("The final price is" + finalPrice);
			
			product.setMarketingStrategy(new MarketingInterface() {

				@Override
				public float getFidelityDiscount(int accountAgeInYears) {
					// TODO Auto-generated method stub
					return 0.5f;
				}
				
			});
			
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}