package LLD.BehaviouralPatterns.MediatorPattern;

import LLD.BehaviouralPatterns.MediatorPattern.Mediator.CarMediator;

public class Driver {
     private CarMediator mediator;

    public Driver(CarMediator mediator) {
        this.mediator = mediator;
    }

    public void startCar() {
        mediator.startEngine();
    }

    public void stopCar() {
        mediator.stopEngine();
    }

    public void accelerateCar() {
        mediator.accelerate();
    }

    public void applyBrakes() {
        mediator.brake();
    }
}
