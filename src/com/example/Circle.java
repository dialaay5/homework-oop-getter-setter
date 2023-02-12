package com.example;

public class Circle {
    // Data
    private double radius;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double newRadius)
    {
        this.radius = newRadius;
    }

    // functions
    public void printSizeFormula()
    {
        System.out.println("the circle length formula is c = 2πr");
    }

    public void printActualSize()
    {
        System.out.format("the actual size of circle with radius %s is : %s \n" ,getRadius() , (getRadius()) * 2 * 3.14);
    }


}

