package ro.ase.csie.cts.g1093.Laboratory3;

import ro.ase.csie.cts.g1093.Laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.Laboratory3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1093.Laboratory3.stage1.Product;
import ro.ase.csie.cts.g1093.Laboratory3.stage1.ProductType;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product();
		
		try {
			product.getFinalPrice(ProductType.NEW, 0, 0);
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}