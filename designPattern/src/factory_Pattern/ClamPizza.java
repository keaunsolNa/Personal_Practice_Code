package factory_Pattern;

public class ClamPizza extends Pizza {
	PizzaIngredientfactory ingredientfactory;
	
	public ClamPizza(PizzaIngredientfactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
		clam = ingredientfactory.createClam();
	}

}
