package com.homework.company;

import com.homework.company.Basketball.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   static ArrayList<Player> team = new ArrayList<>();
    public static void main(String[] args) {

        int userChoice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Basketball GAME!!");
        while (userChoice != 3){
            System.out.println("Please enter your choice:" + "\n" +
                    "1)Add a Player" + "\n" +
                    "2)show all the players" + "\n" +
                    "3)Exit");

        userChoice = scan.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Please choose the player" + "\n" +
                        "1)Offense Player" + "\n" +
                        "2)Defense Player" + "\n" +
                        "3)Center Player");
                userChoice = scan.nextInt();
                switch (userChoice) {
                    case 1:
                        OffensePlayer offensePlayer = new OffensePlayer();
                        addPlayer(offensePlayer);
                        break;

                    case 2:
                        DefensePlayer defensePlayer = new DefensePlayer();
                        addPlayer(defensePlayer);
                        break;

                    case 3:
                        CenterPlayer centerPlayer = new CenterPlayer();
                        addPlayer(centerPlayer);
                        break;
                }
            case 2:
                System.out.println(team);

            case 3:
                System.out.println("\n");
                System.out.println("*** GAME OVER ***");
                break;
        }
    }
    }

    private static void addPlayer(Player p) {
        p.setName(IO.getString("Please enter the first name"));
        p.setLastName(IO.getString("Please enter the last name"));
        p.setTshirtNumber(Integer.valueOf(IO.getString("Please enter the shirt number")));
        p.setPlayerHeight(Double.valueOf(IO.getString("Please enter the height")));
        p.setPercentsShotsFromTheLine(Integer.valueOf(IO.getString("Please enter the percents of shots from the line")));
        p.setPercentsShotsFromtheField(Integer.valueOf(IO.getString("Please enter the percents of shots from the field")));
        p.setThreePointShots(Integer.valueOf(IO.getString("Please enter the percents of three points shots")));

        if(p instanceof OffensePlayer){
            OffensePlayer of = (OffensePlayer) p;
            of.setNumberOfOffense(Integer.valueOf(IO.getString("Please enter the percents of the Offense of the player")));
            team.add(of);
        }
        if(p instanceof DefensePlayer){
            DefensePlayer df = (DefensePlayer) p;
            df.setBlocks(Integer.valueOf(IO.getString("Please enter the percents of the blocks")));
            team.add(df);
        }
        if(p instanceof CenterPlayer){
            CenterPlayer cp = (CenterPlayer) p;
            cp.setNumberOfPass(Integer.valueOf(IO.getString("Please enter the number of passes")));
            team.add(cp);
        }

    }
}

