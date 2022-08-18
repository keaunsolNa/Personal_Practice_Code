package factory_Pattern;

public class VeggiePizza extends Pizza {

	PizzaIngredientfactory ingredientfactory;
	
	public VeggiePizza(PizzaIngredientfactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}
	
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
	}
}
