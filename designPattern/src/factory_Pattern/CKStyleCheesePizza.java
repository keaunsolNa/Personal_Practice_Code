package factory_Pattern;

public class CKStyleCheesePizza extends Pizza {
	public CKStyleCheesePizza() {
//		name = "Chicago Style Deep Dish Cheese Pizza";
//		dough = "Extra Thick Crust Dough";
//		sauce = "Plum Tomato Sauce";
//		
//		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into square clices");
	}

	@Override
	void prepare() {
		// TODO Auto-generated method stub
		
	}
}
