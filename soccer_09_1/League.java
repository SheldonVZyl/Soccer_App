package soccer_09_1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import soccer_08_3.*;
import soccer_08_2.*;
import soccer_08_1.*;
import soccer_07_1.*;
import soccer_06_2.*;
import soccer_06_1.*;
import soccer_09_1.GameUtils;

/**
 *
 * @author sheld
 */
public class League {

    public static void main(String[] args) {
        League theLeague = new League();
        
        //calling createTeams method
        Team[] theTeams = theLeague.createTeams();
        //calling createGames method
        Game[] theGames = theLeague.createGames(theTeams);

        //**********************************GAMES***************************
        Game currGame = theGames[0];
        currGame.playGame();
        
        System.out.println(currGame.getDescription());
    }

    public static Team[] createTeams() {
        //***************TEAM1 (THE GREENS)**********
        Team team1 = new Team();
        team1.setTeamName("The Greens");
        
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        //adding player info
        player1.setPlayerName("George Eliot");
        player2.setPlayerName("Graham Greene");
        player3.setPlayerName("Geoffrey Chaucer");

        //creating array of players(links to team object)
        Player[] thePlayers = {player1, player2, player3};

        //player1.playerName = "Robert Service";
        team1.setPlayerArray(thePlayers);
        
        //***************TEAM2 (THE REDS)**********
        Team team2 = new Team();
        team2.setTeamName("The Reds");
        
        team2.setPlayerArray(new Player[3]);
        team2.getPlayerArray()[0] = new Player();
        team2.getPlayerArray()[0].setPlayerName("Robert Service");
        team2.getPlayerArray()[1] = new Player();
        team2.getPlayerArray()[1].setPlayerName("Robbie Burns");
        team2.getPlayerArray()[2] = new Player();
        team2.getPlayerArray()[2].setPlayerName("Rafael Sabatini");
        
        Team[] theTeams = {team1, team2};
        return theTeams;
        
    }
    
    public static Game[] createGames(Team[] theTeams) {
    Game theGame = new Game();
    theGame.setHomeTeam(theTeams[0]);
    theGame.setAwayTeam(theTeams[1]);
    Game[] theGames = {theGame};
    return theGames;
    }
}