package com.homework.company.Terminal;

import java.util.ArrayList;

/**
 * Created by Bolandian on 03/03/2017.
 */
public class Flight {
    private ArrayList<Passenger> passengers = new ArrayList<>();

    public void bookFlight(Passenger p){
        passengers.add(p);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "passengers=" + passengers +
                '}';
    }
}
