package edu.matc.entjava.indivproj.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user_team")
public class Team {

    @Column(name = "team_name")
    private String teamName;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "team_id")
    private int teamid;

    /*@Column(name = "status")
    @Enumerated
    private Status status; */

    public Team() {
        this.teamName = teamName;
        this.teamid = teamid;
        //this.status = status;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }
}

   /* public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


}*/
