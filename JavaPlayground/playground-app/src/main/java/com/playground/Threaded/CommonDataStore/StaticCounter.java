package com.playground.Threaded.CommonDataStore;

import java.util.concurrent.atomic.AtomicInteger;

public class StaticCounter {
    public static int counter = 0 ; 
    // public static AtomicInteger counter = new AtomicInteger(0);

    public static synchronized void increment() {
        counter++;
    }
}
