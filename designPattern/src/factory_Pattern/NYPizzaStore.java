package factory_Pattern;

public class NYPizzaStore extends PizzaStore{

	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientfactory ingredientfactory = 
				new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")) {

			pizza = new CheesePizza(ingredientfactory);
			pizza.setName("New York Style Cheese Pizza");
			
		} else if (type.equals("veggie")) {
			
			pizza = new VeggiePizza(ingredientfactory);
			pizza.setName("New York Style Veggie Pizza");
			
		} else if (type.equals("clam")) {
			
			pizza = new ClamPizza(ingredientfactory);
			pizza.setName("New York Style Clam Pizza");
			
		} else if (type.equals("pepperoni")) {
			
			pizza = new PepperoniPizza(ingredientfactory);
			pizza.setName("New York Style Pepperoni Pizza");
			
		} 
		
		return pizza;
	}
		
}
	

