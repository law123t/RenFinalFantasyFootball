package edu.matc.entjava.indivproj.persistence;

import edu.matc.entjava.indivproj.entity.Status;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import edu.matc.entjava.indivproj.entity.Team;
import org.apache.log4j.Logger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FootballDAOTest {

    private final Logger logger = Logger.getLogger(this.getClass());
    FootballDAO footballDAO;
    Team team;
    Team team2;
    Team team3;
    Team team4;
    Status status;

    @Before
    //run sql.sql
    public void setup() {
        footballDAO = new FootballDAO();
        team = new Team();
        team2 = new Team();
        team3 = new Team();
        team4 = new Team();

        team.setTeamName("Packers");
        team2.setTeamName("Bears");
        team3.setTeamName("Vikings");
        team4.setTeamName("Lions");

        footballDAO.insert(team);
        footballDAO.insert(team2);
        footballDAO.insert(team3);
    }

    @Test
    public void getAllTeamsTest() {
        List<Team> teams = footballDAO.getAllTeams();
        logger.info("size is " + teams.size());
        assertTrue("team1 is null", !team.equals(null));
        assertTrue("team1 is null", !team2.equals(null));
        assertTrue("size is incorrect", teams.size() > 1);
        for (Team teamArray : teams) {

            assertTrue("team is null", !teamArray.equals(null));
            logger.info(teamArray.getTeamName());
        }
    }

    //Wipe database before execute
    @Test
    public void getTeamByIdTest(){
        logger.info(team.getTeamid());
        logger.info(team.getTeamName());
        Team teamSelect = footballDAO.getTeamById(1);

        assertTrue("team is null", !teamSelect.equals(null));
        assertEquals("teamid is incorrect", "Packers", teamSelect.getTeamName());

        logger.info(teamSelect.getTeamName());
        logger.info("test finished");

    }

    @Test
    public void getTeamByNameTest(){
        logger.info(team.getTeamid());
        logger.info(team.getTeamName());
        List<Team> teamSelect = footballDAO.getByTeamName("Packers");

        assertTrue("team is null", !teamSelect.equals(null));

        for (Team teamArray : teamSelect) {
            logger.info(teamArray.getTeamid());
            assertEquals("teamName is incorrect", "Packers", teamArray.getTeamName());
        }

        logger.info("test finished");
    }

    @Test
    public void insertTest() {
        int footballteam = footballDAO.insert(team4);

        assertTrue("team not inserted", footballteam != 0);
    }

    @Test
    public void updateTest() {
        int id = 4;

        Team teamSelect = footballDAO.getTeamById(id);
        logger.info(team);
        teamSelect.setTeamName("Chargers");
        footballDAO.update(teamSelect);
        teamSelect = footballDAO.getTeamById(id);

        assertTrue("team is null", !teamSelect.equals(null));
        assertEquals("team is not changed", "Chargers",  teamSelect.getTeamName());

        logger.info("test finished");

    }

    @Test
    public void deleteByIDTest() {
        int id = 1;
        footballDAO.insert(team);
        logger.info(team);
        footballDAO.deleteByID(id);
        List<Team> teams = footballDAO.getAllTeams();
        Team teamSelect = footballDAO.getTeamById(id);

        assertEquals("team id 1 exists", null, teamSelect);

    }

}


