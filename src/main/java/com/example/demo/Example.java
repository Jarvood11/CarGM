package com.example.demo;

import java.util.HashSet;
//package Car;
public class Example {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "A8");
        Car car2 = new Car("Suzuki", "Alto");
        Car car3 = new Car("BMW", "X5");

        HashSet<Car> hSetCars = new HashSet<Car>();
        hSetCars.add(car1);
        hSetCars.add(car2);
        hSetCars.add(car3);

        /*
         * To clone HashSet object, use the clone method.
         */
        HashSet<Car> hSetClonedCars = (HashSet<Car>) hSetCars.clone();

        System.out.println("Original HashSet: " + hSetCars);
        System.out.println("Cloned HashSet: " + hSetClonedCars);

        /*
         * Adding or removing elements to either of the HashSet objects
         * does not affect the other
         */

        //add new object to the original HashSet
        hSetCars.add(new Car("Skoda", "Laura"));

        System.out.println("Original HashSet: " + hSetCars);
        System.out.println("Cloned HashSet: " + hSetClonedCars);

        /*
         * However, if you change the element object, the change
         * will be reflected in both the HashSet objects.
         */

        //change an object, this will be changed in both the HashSet objects
        car1.setCarName("Breeza");

        System.out.println("Original HashSet: " + hSetCars);
        System.out.println("Cloned HashSet: " + hSetClonedCars);
    }
}