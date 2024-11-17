package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "Ford's engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "Ford is braking";
    }
}
