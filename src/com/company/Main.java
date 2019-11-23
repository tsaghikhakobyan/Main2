package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //region to test other classes , it's not included in homework
        Circle circle1 = new Circle();
        circle1.setRadius(4);
        double perimeter = circle1.calculatePerimeter();
        double area = circle1.calculateArea();
        // System.out.println(perimeter);
        // System.out.println(area);


        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(2.5);
        rectangle1.setWidth(4);
        double perimeterOfRectangle = rectangle1.calculatePerimeter();
        double areaOfRectangle = rectangle1.calculateArea();
        //System.out.println(perimeterOfRectangle);
        // System.out.println(areaOfRectangle);

        Triangle triangle1 = new Triangle();
        triangle1.setSideA(4);
        triangle1.setSideB(2);
        triangle1.setSideC(5);
        double perimeterOfTriangle = triangle1.calculatePerimeter();
        double areaOfTriangle = triangle1.calculateArea();
        //System.out.println(perimeterOfTriangle);
        //System.out.println(areaOfTriangle);

        Point point1 = new Point();
        Point point2 = new Point();
        point1.setCoordinateX(1);
        point1.setCoordinateY(2);
        point2.setCoordinateX(5);
        point2.setCoordinateY(5);
        double distance2 = point2.distance(point1, point2);
        //System.out.println(distance2);

        TemperatureConverter converter = new TemperatureConverter();
        converter.setCelsius(12);
        converter.setFarenheit(100);
        converter.setKelvin(45);
        double kelvin1 = converter.CelsiusToKelvin();
        //System.out.println(kelvin1);

        //endregion

        Movie[] movielist = new Movie[10];
        Random random = new Random();
        movielist[0] = new Movie("A beautiful mind", random.nextInt(10));
        movielist[1] = new Movie("Knocking on heavens door", random.nextInt(10));
        movielist[2] = new Movie("The Shawshank Redemption", random.nextInt(10));
        movielist[3] = new Movie("Gifted", random.nextInt(10));
        movielist[4] = new Movie("Game of thrones", random.nextInt(10));
        movielist[5] = new Movie("The Pursuit of Happyness", random.nextInt(10));
        movielist[6] = new Movie("Home alone", random.nextInt(10));
        movielist[7] = new Movie("Shutter island", random.nextInt(10));
        movielist[8] = new Movie("Leon", random.nextInt(10));
        movielist[9] = new Movie("Friends", random.nextInt(10));
        for (int i = 0; i < movielist.length; i++) {
            if (movielist[i].getRating() >= 8) {
                System.out.println(movielist[i].getTitle());
            }
        }
    }
}

