package com.company;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public double calculatePerimeter() {
        double perimeter3 = this.sideA + this.sideB + this.sideC;
        return perimeter3;
    }
    public double calculateArea(){
        double perimeter3 = this.sideA + this.sideB + this.sideC;;
        double area3= Math.sqrt(perimeter3*(perimeter3-this.sideA)*(perimeter3-this.sideB)*(perimeter3-this.sideC));
        return area3;
    }

    //Getters and Setters

    //region Getters and Setters

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //endregion
}
