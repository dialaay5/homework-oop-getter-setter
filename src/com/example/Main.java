package com.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("what is a class?\n "+
                "Classes are user-defined data types that act as the blueprint for individual objects, attributes and methods.\n"+
                " It is a basic concept of Object-Oriented Programming which revolve around the real-life entities.\n"+
                " Class in Java determines how an object will behave and what the object will contain.\n");
        System.out.println("what is it good for?\n "+
                "It provides template for creating objects, which can bind code into data.\n" +
                "It has definitions of methods and data.\n" +
                "It supports inheritance property of Object Oriented Programming and hence can maintain class hierarchy.\n" +
                "It helps in maintaining the access specifications of member variables.\n");
        System.out.println("what is an instance?\n "+
                "Objects are instances of a class created with specifically defined data. Objects can correspond to real-world objects or an abstract entity.\n");
        System.out.println(" how do we create a new instance?\n "+
                "Instance is created from a class. We created class that named Car for example, then we created an object of Car, specify the class name, followed by the object name, and use the keyword new.\n");

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        System.out.println(circle1);
        circle1.setRadius(5.4d);
        circle1.printSizeFormula();
        circle1.printActualSize();

        System.out.println(" ");

        System.out.println(circle2);
        circle2.setRadius(8.7d);
        circle2.printSizeFormula();
        circle2.printActualSize();

        Person diala = new Person();
        diala.setId("*********");
        diala.setName("Diala");
        diala.setAddress("Majdal shams");
        diala.setYearOfBirth(1995);
        diala.sayHello();
        diala.printAllData();








    }
}