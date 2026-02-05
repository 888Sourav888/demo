package com.playground.Threaded;
import com.playground.Threaded.CommonDataStore.StaticCounter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ThreadImpl extends Thread{
    String name ; 
    @Override
    public void run(){
        System.out.println("Thread " + this.name + "  is running");

        for(int i = 0 ; i <1000000 ; i++){
            // StaticCounter.counter.incrementAndGet() ; for atomic integer 

            StaticCounter.increment() ;
        }
    }
}
