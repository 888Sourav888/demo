package LLD.BehaviouralPatterns.IteratorPattern.Iterable;

import LLD.BehaviouralPatterns.IteratorPattern.Iterator.Iterator;

public interface Iterable<T> {
    Iterator<T> createIterator();
    
}
