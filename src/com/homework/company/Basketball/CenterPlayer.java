package com.homework.company.Basketball;

/**
 * Created by Bolandian on 03/03/2017.
 */
public class CenterPlayer extends Player {

    private int numberOfPass;

    public CenterPlayer(){
        super();
    }

    public CenterPlayer(String name, String lastName, int tshirtNumber, double playerHeight, int percentsShotsFromTheLine, int percentsShotsFromtheField, int percentsShotsOfThreePoints, int threePointShots, int numberOfPass) {
        super(name, lastName, tshirtNumber, playerHeight, percentsShotsFromTheLine, percentsShotsFromtheField, percentsShotsOfThreePoints, threePointShots);
        this.numberOfPass = numberOfPass;
    }

    public int getNumberOfPass() {
        return numberOfPass;
    }

    public void setNumberOfPass(int numberOfPass) {
        this.numberOfPass = numberOfPass;
    }

    @Override
    public String toString() {
        super.toString();
        return  "Center Player:" +"\n" + super.toString() + "\n" +
                 "Passes: " + numberOfPass +"\n\n";
    }
}
