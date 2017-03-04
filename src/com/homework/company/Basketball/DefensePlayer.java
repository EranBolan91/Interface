package com.homework.company.Basketball;

/**
 * Created by Bolandian on 03/03/2017.
 */
public class DefensePlayer extends Player {

    private int blocks;

    public DefensePlayer() {
        super();
    }

    public DefensePlayer(String name, String lastName, int tshirtNumber, double playerHeight, int percentsShotsFromTheLine, int percentsShotsFromtheField, int percentsShotsOfThreePoints, int threePointShots, int blocks) {
        super(name, lastName, tshirtNumber, playerHeight, percentsShotsFromTheLine, percentsShotsFromtheField, percentsShotsOfThreePoints, threePointShots);
        this.blocks = blocks;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        return "Defense Player:" + "\n" + super.toString() + "\n" +
                "Blocks: " + blocks +"\n\n";
    }
}
