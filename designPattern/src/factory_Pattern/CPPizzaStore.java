package factory_Pattern;

public class CPPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		
		if(type.equals("cheese")) {
			return new CPStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new CPStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new CPStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new CPStylePepperoniPizza();
		} else return null;
	}

}
