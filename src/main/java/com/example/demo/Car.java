package com.example.demo;
class Car{

    private String carBrand;
    private String carName;

    public Car(String carBrand, String carName){
        this.carBrand = carBrand;
        this.carName = carName;
    }

    public String getCarBrand() {
        return carBrand;
    }
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }

    //to print the object
    public String toString(){
        return "[" + getCarBrand() + ", " + getCarName() + "]";
    }
}


