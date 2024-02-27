package util;

import entities.Product;

public class ProductPredicate {
	
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

}
