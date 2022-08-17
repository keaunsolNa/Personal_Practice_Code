package decorator_Pattern;

public class SteamMilk extends CondimentDecorator{
	Beverage beverage;

	public SteamMilk (Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 스팀 필크";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
	
	
}
