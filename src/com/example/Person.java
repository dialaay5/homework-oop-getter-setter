package com.example;

public class Person {
    private String id;
    private String name;
    private int yearOfBirth;
    private String address;

    public String getId()
    {
        return id;
    }
    public void setId(String newId)
    {
        this.id = newId;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }
    public void setYearOfBirth(int newYearOfBirth)
    {
        this.yearOfBirth = newYearOfBirth;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        this.address = newAddress;
    }

    public void  sayHello()
    {
        System.out.println("\nhello everyone");
    }
    public void printAllData() {
        System.out.format("my name is %s, with Id number %s , I'am from %s, %d is my birthday year.", this.name, this.id, this.address, this.yearOfBirth);
    }

}
