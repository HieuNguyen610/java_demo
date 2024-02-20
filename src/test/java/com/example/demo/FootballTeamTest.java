package com.example.demo;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.demo.service.FootballTeam;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {

    @Test
    public void shouldGetGameWon() {
        FootballTeam footballTeam = new FootballTeam(3);
        assertEquals(3, footballTeam.getGamesWon());
    }

    public Object[] nbOfGamesWon() {
        return $(0, 1, 2);
    }
    @Test
    @Parameters(method = "nbOfGamesWon")
    public void constructorShouldSetGamesWon(int nbOfGamesWon) {
        FootballTeam team = new FootballTeam(nbOfGamesWon);
        assertEquals(nbOfGamesWon + " games passed to constructor, " + "but " + team.getGamesWon() + " were returned",
            nbOfGamesWon, team.getGamesWon());
    }

    @Test
    public void teamsWithLessMatchesWonShouldBeLesser() {
        FootballTeam team_2 = new FootballTeam(2);
        FootballTeam team_3 = new FootballTeam(3);
        assertTrue("team with " + team_2.getGamesWon()
                + " games won should be ranked after the team with "
                + team_3.getGamesWon() + " games won",
            team_2.compareTo(team_3) < 0);
    }

    @Test
    public void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
        FootballTeam teamA = new FootballTeam(2);
        FootballTeam teamB = new FootballTeam(2);
        assertTrue("both teams have won the same number of games: "
                + teamA.getGamesWon() + " vs. " + teamB.getGamesWon()
                + " and should be ranked equal",
            teamA.compareTo(teamB) == 0);
    }
}
