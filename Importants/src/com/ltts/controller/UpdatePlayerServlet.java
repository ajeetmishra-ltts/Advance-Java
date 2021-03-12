package com.ltts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.PlayerDao;
import com.ltts.model.Player;

/**
 * Servlet implementation class UpdatePlayerServlet
 */
@WebServlet("/UpdatePlayerServlet")
public class UpdatePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter(); 
			int Playerid=Integer.parseInt(request.getParameter("pid"));
			String Name=request.getParameter("pname");
			int DOB=Integer.parseInt(request.getParameter("pdate"));
			String country=request.getParameter("pcountry");
			String Skill=request.getParameter("pskill");
			int Runs=Integer.parseInt(request.getParameter("pruns"));
			int Wickets=Integer.parseInt(request.getParameter("pwickets"));
			int Teamid=Integer.parseInt(request.getParameter("tid"));
			int Matches=Integer.parseInt(request.getParameter("pmatch"));
			Player p = new Player(Playerid,Name,DOB,country,Skill,Runs,Wickets,Teamid,Matches);
			System.out.println("Inside Update Player Servlet: "+p);
			PlayerDao pd=new PlayerDao();
			boolean b=false;
			RequestDispatcher rd=null;
			try {
				b=pd.updatePlayer(Playerid,Name,DOB,country,Skill,Runs,Wickets,Teamid,Matches); // Control TRanfers to Dao file
				rd=request.getRequestDispatcher("Result.html");
				rd.forward(request, response);
				//System.out.println("Successfully Inserted...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.write("Already Player id Used: "+e);
				rd=request.getRequestDispatcher("addplayer.html");
				rd.include(request, response);
				e.printStackTrace();
			}
	}
}
