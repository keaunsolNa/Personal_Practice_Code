package factory_Pattern;

public class CheesePizza extends Pizza {

	PizzaIngredientfactory ingredientfactory;
	
	public CheesePizza(PizzaIngredientfactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}
	
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
	}
}
