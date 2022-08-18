package factory_Pattern;

public class PepperoniPizza extends Pizza {

	PizzaIngredientfactory ingredientfactory;
	
	public PepperoniPizza(PizzaIngredientfactory ingredientfactory) {
		this.ingredientfactory = ingredientfactory;
	}
	
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientfactory.createDough();
		sauce = ingredientfactory.createSauce();
		cheese = ingredientfactory.createCheese();
	}
}
