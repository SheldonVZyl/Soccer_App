package soccer_13_3;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author sheld
 */
public class Player {
    
    private String playerName;
    private int goalsScored;
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public Player() {}
    //13.3
    public void incGoalsScored() {
    this.goalsScored++;
    }
    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the goalsScored
     */
    public int getGoalsScored() {
        return goalsScored;
    }

    /**
     * @param goalsScored the goalsScored to set
     */
    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
    
}