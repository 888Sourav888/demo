package LLD.BehaviouralPatterns.StrategyPattern;

import LLD.BehaviouralPatterns.StrategyPattern.Game;
import LLD.BehaviouralPatterns.StrategyPattern.Strategy.IdealCheckoutStrategy;
import LLD.BehaviouralPatterns.StrategyPattern.Strategy.SaleCheckoutStrategy;

public class client {
    public static void main(String[] args) {
        SteamCart cart = new SteamCart() ; 
        cart.setCheckoutStrategy(new IdealCheckoutStrategy()) ; 
        cart.addGame(new Game("Game A" , 100)) ; 
        cart.addGame(new Game("Game B" , 200)) ; 
        cart.checkout() ; 

        cart.setCheckoutStrategy(new SaleCheckoutStrategy()) ; 
        // cart.addGame(new Game("Game C" , 300)) ; 
        cart.checkout() ; 
    }
}
