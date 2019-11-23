package com.company;

public class Circle {
    private double radius;

    public Circle() {
    }


    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    public double calculateArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
//Getters and setters

    //region Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //endregion

}


