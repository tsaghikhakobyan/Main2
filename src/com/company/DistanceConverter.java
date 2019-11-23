package com.company;

public class DistanceConverter {
    private double mile;
    private double meter;

    public DistanceConverter() {
    }

    public double convertMetersToMiles() {
        double mile = this.meter * 0.000621371;
        return mile;
    }
    public double convertMilesToMeters() {
        double meter = this.mile * 1609.34;
        return meter;
    }

    //regionGetters and Setters

    public double getMile() {
        return mile;
    }

    public void setMile(double mile) {
        this.mile = mile;
    }

    public double getMeter() {
        return meter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }
    //endregion
}
