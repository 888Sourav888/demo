package LLD.BehaviouralPatterns.MediatorPattern.Mediator;

import LLD.BehaviouralPatterns.MediatorPattern.Car;
import LLD.BehaviouralPatterns.MediatorPattern.Driver;

public class CarControlSystem implements CarMediator {
       private Car car;
 

    public CarControlSystem(Car car ) {
        this.car = car;
      
    }

    @Override
    public void startEngine() {
        if (!car.isEngineRunning()) {
            car.setEngineRunning(true);
            System.out.println("Engine started!");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    @Override
    public void stopEngine() {
        if (car.isEngineRunning()) {
            car.setEngineRunning(false);
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already stopped.");
        }
    }

    @Override
    public void accelerate() {
        if (car.isEngineRunning()) {
            car.increaseSpeed();
            System.out.println("Accelerating... Current speed: " + car.getSpeed() + " km/h");
        } else {
            System.out.println("Can't accelerate. Engine is off.");
        }
    }

    @Override
    public void brake() {
        if (car.getSpeed() > 0) {
            car.decreaseSpeed();
            System.out.println("Braking... Current speed: " + car.getSpeed() + " km/h");
        } else {
            System.out.println("Car is already stopped.");
        }
    }
    
}
