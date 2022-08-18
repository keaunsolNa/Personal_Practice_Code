package factory_Pattern;

public class CKPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		
		if(type.equals("cheese")) {
			return new CKStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new CKStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new CKStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new CKStylePepperoniPizza();
		} else return null;
	}

}
