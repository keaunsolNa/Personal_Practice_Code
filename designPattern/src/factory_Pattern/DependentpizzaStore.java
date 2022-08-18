package factory_Pattern;

public class DependentpizzaStore {

	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		
		if(style.equals("NY")) {
			if(type.endsWith("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if(type.equals("veggie")) {
				pizza  = new NYStyleVeggiePizza();
			} else if(type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if(type.equals("pepperoni")) {
				pizza  = new NYStylePepperoniPizza();
			}
		} else if(style.equals("Chicago")) {
			if(type.endsWith("cheese")) {
				pizza = new CKStyleCheesePizza();
			} else if(type.equals("veggie")) {
				pizza  = new CKStyleVeggiePizza();
			} else if(type.equals("clam")) {
				pizza = new CKStyleClamPizza();
			} else if(type.equals("pepperoni")) {
				pizza  = new CKStylePepperoniPizza();
			}
		} else {
			System.out.println("Error : invalid type of pizza");
			return null;
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
