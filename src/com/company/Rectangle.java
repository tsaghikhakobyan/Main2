package com.company;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
    }

    public double calculatePerimeter() {
        double perimeter = 2 * (this.height + this.width);
        return perimeter;
    }

    public double calculateArea() {
        double area = this.height* this.width;
        return area;
    }

    //Getters and Setters

    //region Getters nd Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //endregion

}



