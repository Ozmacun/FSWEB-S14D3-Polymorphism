package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;


    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine(){

        System.out.println(getClass().getSimpleName());
        return getName() + " car starting...";
    }
    @Override
    public String drive(){
        runEngine(this);
        System.out.println(getClass().getSimpleName());
        return "Hybrid car being driven";
    }


}
