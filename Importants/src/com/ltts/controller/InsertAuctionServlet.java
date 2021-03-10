package com.ltts.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.AuctionDao;
import com.ltts.dao.PlayerDao;
import com.ltts.model.Auction;
import com.ltts.model.Player;

/**
 * Servlet implementation class InsertAuctionServlet
 */
@WebServlet("/InsertAuctionServlet")
public class InsertAuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAuctionServlet() {
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
		int aid=Integer.parseInt(request.getParameter("ano"));
		int pid=Integer.parseInt(request.getParameter("pno"));
		int tid=Integer.parseInt(request.getParameter("tno"));
		int amt=Integer.parseInt(request.getParameter("amt"));
		Auction p=new Auction(aid,pid,tid,amt);
		System.out.println("Inside Servlet: "+p);
		AuctionDao pd=new AuctionDao();
		boolean b=false;
		try {
			b=pd.insertAuction(p); // Control TRanfers to Dao file
			RequestDispatcher rd = request.getRequestDispatcher("");
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}