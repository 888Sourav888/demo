package LLD.BehaviouralPatterns.ObserverPattern.Subscriber;

public class Player implements Subscriber{
    String roomMessage ; 
    String name ; 
    public Player(String name){
        this.name = name ; 
    }
    @Override
    public void update(String message){
        this.roomMessage = message;
        System.out.println("Player " + name + " received message: " + message);
    }
}
