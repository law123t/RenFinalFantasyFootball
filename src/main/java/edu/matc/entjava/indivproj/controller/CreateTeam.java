package edu.matc.entjava.indivproj.controller;

import edu.matc.entjava.indivproj.persistence.FootballDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Servlet for team
 * @author lthao
 */

@WebServlet(
        urlPatterns = {"/createTeam"}
)

public class CreateTeam extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FootballDAO teamdao = new FootballDAO();
        //req.setAttribute("Team", teamdao./**TODO run method**/());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/createresults.jsp");
        dispatcher.forward(req, resp);
    }
}
