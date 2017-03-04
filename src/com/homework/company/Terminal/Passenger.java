package com.homework.company.Terminal;

/**
 * Created by Bolandian on 03/03/2017.
 */
public class Passenger {

    private String name;
    private double age;

    public  Passenger(){

    }

    public Passenger(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public double priceToPay(double basicTicketPrice){

        return basicTicketPrice;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
