package LLD.BehaviouralPatterns.StrategyPattern.Strategy;

public class SaleCheckoutStrategy implements CheckoutStrategy {
    @Override
    public void checkout(String item, int price) {
        int salePrice = (int) (price - (price * 0.5)); // 50% discount
        System.out.println("Checking out " + item + " at sale price: " + salePrice);
    }
    
}
