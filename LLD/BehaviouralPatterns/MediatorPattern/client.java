package LLD.BehaviouralPatterns.MediatorPattern;

import LLD.BehaviouralPatterns.MediatorPattern.Mediator.CarControlSystem;

public class client {
    public static void main(String[] args){
         Car car = new Car();
        Driver driver = new Driver(new CarControlSystem(car));
        
        // Driver interacts with the car through the mediator (CarControlSystem)
        driver.startCar();  // Start the car
        driver.accelerateCar();  // Accelerate
        driver.accelerateCar();  // Accelerate again
        driver.applyBrakes();  // Apply brakes
        driver.stopCar();  // Stop the car   
    }
}
