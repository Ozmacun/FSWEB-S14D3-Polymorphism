package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        System.out.println("----------------------------");

        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "A traditional gas-powered car", 15.5, 4);
        CarSkeleton electricCar = new ElectricCar("Electric Car", "A fully electric car", 250.0, 85);
        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "A hybrid car with gas and electric power", 20.0, 50, 4);

        // Test GasPoweredCar
        System.out.println("Testing GasPoweredCar:");
        gasCar.startEngine();
        gasCar.drive();


        // Test ElectricCar
        System.out.println("\nTesting ElectricCar:");
        electricCar.startEngine();
        electricCar.drive();


        // Test HybridCar
        System.out.println("\nTesting HybridCar:");
        hybridCar.startEngine();
        hybridCar.drive();

    }
}