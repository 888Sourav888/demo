package LLD.BehaviouralPatterns.ObserverPattern.Publisher;
import LLD.BehaviouralPatterns.ObserverPattern.Subscriber.Player ; 
import java.util.* ; 
import LLD.BehaviouralPatterns.ObserverPattern.Subscriber.Subscriber;
public class GameState implements Publisher {
    // Implementation details would go here
    private List<Player> players = new ArrayList<>();
    @Override
    public void subscribe(Subscriber subscriber) {
        players.add((Player) subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        players.remove((Player) subscriber);
    }

    @Override
    public void notifySubscribers(String message) {
        for (Player player : players) {
            player.update(message);
        }
    }
}