package com.homework.company.Terminal;

/**
 * Created by Bolandian on 03/03/2017.
 */
public class VIPPassenger extends Passenger  {

    private double extraDiscount;

    public  VIPPassenger(){
        super();
    }

    public VIPPassenger(String name, double age, double extraDiscount) {
        super(name, age);
        this.extraDiscount = extraDiscount;
    }

    @Override
    public double priceToPay(double basicTicketPrice) {
        double daddy = super.priceToPay(basicTicketPrice);
        return daddy * (extraDiscount);
    }


    @Override
    public String toString() {
        return super.toString() + "\n Extra Discount: " + extraDiscount;
    }

    public double getExtraDiscount() {
        return extraDiscount;
    }

    public void setExtraDiscount(double extraDiscount) {
        this.extraDiscount = extraDiscount;
    }
}
