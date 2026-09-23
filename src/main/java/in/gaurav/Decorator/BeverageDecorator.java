package in.gaurav.Decorator;

import in.gaurav.Beverage;

public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;
    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
