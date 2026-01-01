package LLD.BehaviouralPatterns.StrategyPattern;

import LLD.BehaviouralPatterns.StrategyPattern.Strategy.CheckoutStrategy;
import java.util.* ; 
public class SteamCart {
    
    CheckoutStrategy checkoutStrategy ;
    List<Game> games ; 
    public SteamCart(){
        games = new ArrayList<>() ;
    }
    public void setCheckoutStrategy(CheckoutStrategy checkoutStrategy){
        this.checkoutStrategy = checkoutStrategy ; 
    }
    public void addGame(Game game ){
        games.add(game) ; 
    }
    public void removeGame(Game game){
        games.remove(game) ; 
    }
    public void checkout(){
        for(Game game : games){
            checkoutStrategy.checkout(game.name , game.price) ; 
        }
    }
}

