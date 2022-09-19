package com.example;

public class Vehicle {
    private String name;
    private int number;
    private int noOfWheels;
    private double weight;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", noOfWheels=" + noOfWheels +
                ", weight=" + weight +
                '}';
    }

    public Vehicle(String name, int number, int noOfWheels, double weight) {
        this.name = name;
        this.number = number;
        this.noOfWheels = noOfWheels;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("TATA", 567, 6, 12000);
        int a=10;
        String s="hi";
        System.out.println(a+" "+s);
        System.out.println(v);// packageName+className @Hexadecimal
    }
}