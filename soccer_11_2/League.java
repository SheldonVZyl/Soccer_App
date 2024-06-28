package soccer_11_2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.StringTokenizer;
import soccer_11_2.PlayerDatabase;

/**
 *
 * @author sheld
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        League theLeague = new League();

        Team[] theTeams = theLeague.createTeams("The Robins,The Crows,The Swallows", 5);
        Game[] theGames = theLeague.createGames(theTeams);

        /* Practice 11-2. Print the League announcement here */
        System.out.println(theLeague.getLeagueAnnouncement(theGames));
        for (Game currGame : theGames) {
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }

        theLeague.showBestTeam(theTeams);
    }

    public Team[] createTeams(String teamNames, int teamSize) {

        PlayerDatabase playerDB = new PlayerDatabase();

        StringTokenizer teamNameTokens = new StringTokenizer(teamNames, ",");
        Team[] theTeams = new Team[teamNameTokens.countTokens()];
        for (int i = 0; i < theTeams.length; i++) {
            theTeams[i] = new Team(teamNameTokens.nextToken(), playerDB.getTeam(teamSize));
        }

        return theTeams;
    }

    public Game[] createGames(Team[] theTeams) {
        /* Practice 11-2. Add a line to declare and initialize daysBetweenGames variable */
        ArrayList theGames = new ArrayList();
        int daysBetweenGames = 0;

        for (Team homeTeam : theTeams) {
            for (Team awayTeam : theTeams) {
                if (homeTeam != awayTeam) {
                    /* Practice 11-2. Increment daysBetweenGames here */
                    daysBetweenGames += 7;
                    /* Practice 11-2. Modify the statement below to add pass LocalDateTime into constructor */
                    theGames.add(new Game(homeTeam, awayTeam, LocalDateTime.now().plusDays(daysBetweenGames)));
                }

            }
        }

        return (Game[]) theGames.toArray(new Game[1]);
    }

    public void showBestTeam(Team[] theTeams) {
        Team currBestTeam = theTeams[0];
        System.out.println("\nTeam Points");

        for (Team currTeam : theTeams) {
            System.out.println(currTeam.getTeamName() + " : " + currTeam.getPointsTotal() + " : "
                    + currTeam.getGoalsTotal());
            currBestTeam = currTeam.getPointsTotal() > currBestTeam.getPointsTotal() ? currTeam : currBestTeam;
            if (currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
                currBestTeam = currTeam;
            } else if (currTeam.getPointsTotal() == currBestTeam.getPointsTotal()) {
                if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
                    currBestTeam = currTeam;
                }
            }
        }

        System.out.println("Winner of the League is " + currBestTeam.getTeamName());

    }

    /* Practice 11-2. Add the getLeagueAnnouncement() method here */
    public String getLeagueAnnouncement(Game[] theGames) { 
    Period thePeriod = Period.between(theGames[0].getTheDateTime().toLocalDate(), 
            theGames[theGames.length - 1].getTheDateTime().toLocalDate());
    return ("The League is scheduled to run for " +
            thePeriod.getMonths() + " month(s), and " +
            thePeriod.getDays() + " day(s)\n");
   }
}