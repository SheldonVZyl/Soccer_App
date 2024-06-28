package soccer_08_2;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import soccer_08_1.*;
import soccer_07_1.*;
import soccer_06_2.*;
import soccer_06_1.*;
import soccer_08_2.GameUtils;

/**
 *
 * @author sheld
 */
public class Game {

    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    public void playGame() {

        //onlt 1 - 6 goals can be scored
        int numOfGoals = (int) (Math.random() * 7);
        Goal[] theGoals = new Goal[numOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);
    }

    public String getDescription() {
        StringBuilder returnString = new StringBuilder();
        for (Goal currGoal : this.goals) {
            returnString.append("Goal scored after " + currGoal.theTime + " mins by "
                    + currGoal.thePlayer.playerName + " of " + currGoal.theTeam.teamName + "\n");

        }
        return returnString.toString();
    }
}