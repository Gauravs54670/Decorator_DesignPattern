package in.gaurav.Decorator;

import in.gaurav.Beverage;

public class CreamDecorator extends BeverageDecorator{
    public CreamDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Cream";
    }
}
