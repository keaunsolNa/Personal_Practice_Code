package template_Method_Pattern;

public class Tea extends CaffeineBeverage{
	
	
	@Override
	void brew() {
		System.out.println("차를 우려내는 중");
	}

	@Override
	void addCondiments() {
		System.out.println("레몬을 추가하는 중");
	}
}
