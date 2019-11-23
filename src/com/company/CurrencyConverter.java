package com.company;

public class CurrencyConverter {
    private double dram;
    private double euro;
    private double dollar;
    private double ruble;

    public CurrencyConverter() {
    }

    public double convertDollarToEuro() {
        double euro = 0.91 * this.dollar;
        return euro;
    }

    public double convertDollarToDram() {
        double dram = 476.95 * this.dollar;
        return dram;
    }

    public double convertDollarToRuble() {
        double ruble = 63.87 * this.dollar;
        return ruble;
    }

    public double convertEuroToDollar() {
        double dollar = 1.1 * this.euro;
        return dollar;
    }

    public double convertEuroToDram() {
        double dram = 525.72 * this.euro;
        return dram;
    }

    public double convertDramToDollar() {
        double dollar = 0.0021 * this.dram;
        return dollar;
    }

    public double convertDramToEuro() {
        double euro = 0.0019 * this.dram;
        return euro;
    }

    public double convertDramToRuble() {
        double ruble = 0.13 * this.dram;
        return ruble;
    }

    public double convertRubleToDollar() {
        double dollar = 0.016 * this.ruble;
        return dollar;
    }

    public double convertRubleToEuro() {
        double euro = 0.014 * this.ruble;
        return euro;
    }

    public double convertRubleToRuble() {
        double dram = 7.47 * this.ruble;
        return dram;
    }

    //region Getters and Setters


    public double getDram() {
        return dram;
    }

    public void setDram(double dram) {
        this.dram = dram;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    public double getRuble() {
        return ruble;
    }

    public void setRuble(double ruble) {
        this.ruble = ruble;
    }
    //endregion

}
