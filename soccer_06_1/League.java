/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer_06_1;

/**
 *
 * @author sheld
 */
public class League {
    public static void main(String[] args) {
        //*********************TEAM 1 (THE GREENS)*****************************
        //instantiating objects
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        
        //adding player info
        player1.playerName = "George Eliot";
        player2.playerName = "Graham Greene";
        player3.playerName = "Geoffrey Chaucer";
        
        //creating array of players(links to team object)
        Player[] thePlayers = {player1, player2, player3};
        
        //player1.playerName = "Robert Service";
        
        //instantiate a team
        Team team1 = new Team();
        
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;
        
        //team1
        System.out.println(team1.teamName + " Players: ");
        for(Player thePlayer: team1.playerArray) {
            System.out.println(thePlayer.playerName);
        }
        //*********************TEAM 2 (THE REDS)*****************************
        Team team2 = new Team();
        team2.teamName = "The Reds";
        
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        //team2
        System.out.println(team2.teamName + " Players: ");
        for(Player thePlayer: team2.playerArray) {
            System.out.println(thePlayer.playerName);
        }
    }
}
