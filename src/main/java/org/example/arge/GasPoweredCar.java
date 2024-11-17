package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return getName() + " car starting with " + cylinders + " cylinders...";
    }
    @Override
    public String drive(){
        runEngine(this);
        System.out.println(getClass().getSimpleName());
        return "GasPoweredCar car being driven";
    }



}
