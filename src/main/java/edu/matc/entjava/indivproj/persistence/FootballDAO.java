package edu.matc.entjava.indivproj.persistence;

import edu.matc.entjava.indivproj.entity.Team;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import java.util.ArrayList;
import java.util.List;

public class FootballDAO {

    private final Logger log = Logger.getLogger(this.getClass());

    public List<Team> getAllTeam() {
        List<Team> teams = new ArrayList<Team>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            teams = session.createCriteria(Team.class).list();
        } catch (HibernateException he) {
            log.error("Error getting all teams", he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return teams;
    }

    public Team getTeamById(int teamid) {
        Team team = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            team = (Team) session.get(Team.class, teamid);
        } catch (HibernateException he) {
            log.error("Error getting user with id: " + teamid, he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return team;
    }

    public List<Team> getByTeamName(String teamName) {
        List<Team> teams = new ArrayList<Team>();
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(Team.class);
            criteria.add(Restrictions.eq("teamName", teamName));
            teams = criteria.list();
        } catch (HibernateException he) {
            log.error("Error getting team name: " + teamName, he);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return teams;
    }


    public void update(Team team) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(team);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back save of team: " + team, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public int insert(Team team) {
        int id = 0;
        Transaction transaction = null;
        Session session = null;
        try {
            session = SessionFactoryProvider.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            id = (int) session.save(team);
            transaction.commit();
        } catch (HibernateException he){
            if (transaction != null) {
                try {
                    transaction.rollback();
                } catch (HibernateException he2) {
                    log.error("Error rolling back save of team: " + team, he2);
                }
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return id;
    }
}
