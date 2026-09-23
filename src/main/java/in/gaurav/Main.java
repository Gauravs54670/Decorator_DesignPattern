package in.gaurav;


import in.gaurav.Decorator.BeverageDecorator;
import in.gaurav.Decorator.CreamDecorator;
import in.gaurav.Decorator.MilkDecorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        System.out.println(
                "Coffee price is " + beverage.getCost() +"\n"+
                        "Coffee description is " + beverage.getDescription()
        );



        Beverage bvg = new Coffee();
        double coffeePrice = bvg.getCost();
        String coffeeDescription = bvg.getDescription();
        BeverageDecorator decorator = new MilkDecorator(bvg);
        System.out.println(
                "Coffee price " + (coffeePrice + decorator.getCost())
                        +"\n"+ "Coffee description " + coffeeDescription+ " " + decorator.getDescription());
        decorator = new CreamDecorator(bvg);
        System.out.println("Coffee price " + (coffeePrice + decorator.getCost()) +"\n"+
                "Coffee description " + coffeeDescription+ " " + decorator.getDescription());

    }
}