package com.playground;

import com.playground.Threaded.ThreadImpl;
import com.playground.Threaded.CommonDataStore.StaticCounter;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {

        System.out.println("Before running the two threads counter value:" +  StaticCounter.counter); 
        ThreadImpl thread1 = new ThreadImpl("Thread-1");
        thread1.start();
        ThreadImpl thread2 = new ThreadImpl("Thread-2");
        thread2.start();


        thread1.join() ; 
        thread2.join() ; 
        System.out.println("After running the two threads counter value:" +  StaticCounter.counter); 
    }
}
