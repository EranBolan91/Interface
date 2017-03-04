package com.homework.company.Basketball;

import java.util.Random;

/**
 * Created by Bolandian on 03/03/2017.
 */
public class Player {

    private String name;
    private String LastName;
    private int TshirtNumber;
    private double playerHeight;
    private int percentsShotsFromTheLine;
    private int percentsShotsFromtheField;
    private int percentsShotsOfThreePoints;
    private int threePointShots;

    public Player(){

    }

    public Player(String name, String lastName, int tshirtNumber, double playerHeight, int percentsShotsFromTheLine, int percentsShotsFromtheField, int percentsShotsOfThreePoints, int threePointShots) {
        this.name = name;
        this.LastName = lastName;
        this.TshirtNumber = tshirtNumber;
        this.playerHeight = playerHeight;
        this.percentsShotsFromTheLine = percentsShotsFromTheLine;
        this.percentsShotsFromtheField = percentsShotsFromtheField;
        this.percentsShotsOfThreePoints = percentsShotsOfThreePoints;
        this.threePointShots = threePointShots;
    }

    public boolean shotsFromTheLine(int precentsShotsFromTheLine){
        Random r = new Random();
      int precent =  r.nextInt(100)+1;
        if(precent <= precentsShotsFromTheLine)
            return true;
        return false;
    }

    public boolean shotsFromTheField(int precentsShotsFromtheField){
        Random r = new Random();
        int precent =  r.nextInt(100)+1;
        if(precent <= precentsShotsFromtheField)
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getTshirtNumber() {
        return TshirtNumber;
    }

    public void setTshirtNumber(int tshirtNumber) {
        TshirtNumber = tshirtNumber;
    }

    public double getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(double playerHeight) {
        this.playerHeight = playerHeight;
    }

    public int getPercentsShotsFromTheLine() {
        return percentsShotsFromTheLine;
    }

    public void setPercentsShotsFromTheLine(int percentsShotsFromTheLine) {
        this.percentsShotsFromTheLine = percentsShotsFromTheLine;
    }

    public int getPercentsShotsFromtheField() {
        return percentsShotsFromtheField;
    }

    public void setPercentsShotsFromtheField(int percentsShotsFromtheField) {
        this.percentsShotsFromtheField = percentsShotsFromtheField;
    }

    public int getThreePointShots() {
        return threePointShots;
    }

    public void setThreePointShots(int threePointShots) {
        this.threePointShots = threePointShots;
    }

    public int getPercentsShotsOfThreePoints() {
        return percentsShotsOfThreePoints;
    }

    public void setPercentsShotsOfThreePoints(int percentsShotsOfThreePoints) {
        this.percentsShotsOfThreePoints = percentsShotsOfThreePoints;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Last name: " + LastName + "\n" +
                "Shirt number: " + TshirtNumber + "\n" +
                 "Height: " + playerHeight + "\n" +
                        "Percent of shots from the line: " + percentsShotsFromTheLine + "\n" +
                 "Percents of shots from the field: " + percentsShotsFromtheField + "\n" +
                "Percents of three points shots: " + percentsShotsOfThreePoints +"\n";
    }
}
