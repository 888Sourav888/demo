package LLD.BehaviouralPatterns.ObserverPattern.Publisher;

import LLD.BehaviouralPatterns.ObserverPattern.Subscriber.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String message);
}
