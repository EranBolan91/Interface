package com.homework.company.Basketball;

/**
 * Created by Bolandian on 03/03/2017.
 */
public class OffensePlayer extends Player {

    private int numberOfOffense;

    public OffensePlayer(){
        super();
    }

    public OffensePlayer(String name, String lastName, int tshirtNumber, double playerHeight, int percentsShotsFromTheLine, int percentsShotsFromtheField, int percentsShotsOfThreePoints, int threePointShots, int numberOfOffense) {
        super(name, lastName, tshirtNumber, playerHeight, percentsShotsFromTheLine, percentsShotsFromtheField, percentsShotsOfThreePoints, threePointShots);
        this.numberOfOffense = numberOfOffense;
    }

    public int getNumberOfOffense() {
        return numberOfOffense;
    }

    public void setNumberOfOffense(int numberOfOffense) {
        this.numberOfOffense = numberOfOffense;
    }

    @Override
    public String toString() {

        return "Offense Player:" +"\n" + super.toString() + "\n" +
                "Offense: " + numberOfOffense +"\n\n";
    }
}
