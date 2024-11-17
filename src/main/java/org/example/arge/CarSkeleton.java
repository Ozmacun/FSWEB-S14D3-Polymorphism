package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public String startEngine(){
       System.out.println("ClassName: " + getClass().getSimpleName());
       return getName() + " starting engine";
    }

    public String drive(){
        runEngine(this);
        System.out.println("ClassName: " + getClass().getSimpleName());
        return getName() + " being driven ";
    }

    protected void runEngine(CarSkeleton carSkeleton){
        System.out.println(name + ": The engine is running smoothly...");
    }



}
