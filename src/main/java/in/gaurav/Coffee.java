package in.gaurav;

public class Coffee implements Beverage{
    @Override
    public double getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
