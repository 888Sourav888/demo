package LLD.BehaviouralPatterns.ObserverPattern;

import LLD.BehaviouralPatterns.ObserverPattern.Publisher.GameState;
import LLD.BehaviouralPatterns.ObserverPattern.Subscriber.Player;
import LLD.BehaviouralPatterns.ObserverPattern.Subscriber.Subscriber;

public class client {
    public static void main(String[] args){
        GameState gameState = new GameState();
        Player player1 = new Player("Andy");
        Player player2 = new Player("Bob");  
        gameState.subscribe((Subscriber) player1);
        gameState.subscribe((Subscriber) player2);
        gameState.notifySubscribers("Game has started!");

    }
}
