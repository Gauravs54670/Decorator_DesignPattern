package in.gaurav.Decorator;

import in.gaurav.Beverage;

public class MilkDecorator extends  BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 30.0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Milk";
    }
}
