package com.company;

public class Point {
    private double coordinateX;
    private double coordinateY;

    public Point() {

    }


    public double distance() {
        double distance = Math.sqrt(Math.pow(this.coordinateX, 2) + Math.pow(this.coordinateY, 2));
        return distance;
    }

    public double distance(Point point1, Point point2) {
        point1.getCoordinateX();
        point1.getCoordinateY();
        point2.getCoordinateX();
        point2.getCoordinateY();
        double distance2 = Math.sqrt(Math.pow((point2.getCoordinateX() - point1.getCoordinateX()), 2) + (Math.pow((point2.getCoordinateY() - point1.getCoordinateY()), 2)));
    return  distance2;
    }

    //Getters and Setters

    //region Getters and Setters

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
    //endregion
}
