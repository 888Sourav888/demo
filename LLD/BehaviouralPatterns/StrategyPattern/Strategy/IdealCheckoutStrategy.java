package LLD.BehaviouralPatterns.StrategyPattern.Strategy;

public class IdealCheckoutStrategy implements CheckoutStrategy {
    @Override
    public void checkout(String item, int price) {
        System.out.println("Checking out " + item + " at ideal price: " + price);
    }
    
}
