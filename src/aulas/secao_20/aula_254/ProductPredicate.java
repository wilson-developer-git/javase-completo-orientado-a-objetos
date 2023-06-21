package aulas.secao_20.aula_254;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}

}
