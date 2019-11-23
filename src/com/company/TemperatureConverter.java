package com.company;

public class TemperatureConverter {
    private double celsius;
    private double farenheit;
    private double kelvin;


    public TemperatureConverter() {
    }

    public double convertFarenheitToCelsius() {
        double celsius = (this.farenheit - 32) * 5 / 9;
        return celsius;
    }

    public double convertFarenheitToKelvin() {
        double kelvin = (this.farenheit + 459.67) * 5 / 9;
        return kelvin;
    }

    public double CelsiusToFarenheit() {
        double farenheit = this.celsius * 9 / 5 + 32;
        return farenheit;
    }

    public double CelsiusToKelvin() {
        double kelvin = this.celsius + 273.15;
        return kelvin;
    }

    public double KelvinToFarenheit() {
        double farenheit = this.celsius * 9 / 5 - 459.67;
        return farenheit;
    }

    public double KelvinToCelsius() {
        double celsius = this.kelvin - 273.15;
        return celsius;
    }

    //region Getters and Setters


    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.farenheit = farenheit;
    }
    //endregion


}
