package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configure.MyConnection;
import com.ltts.model.Player;
import com.ltts.model.Team;

public class TeamDao {
	
		public List<Team> TeamDao()
		{
			List<Team> li= new ArrayList<Team>();
			return li;
		}
		public Team getTeamById(int id)
		{
			Team p=new Team(id, null, null, null, id);
			return p;
		}
		
	
	
	

	public boolean insertTeam(Team t) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into team values(?,?,?,?,?)");
		ps.setInt(1, t.getTeamId());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnerName());
		ps.setString(4, t.getCoachName());
		ps.setInt(5, t.getPlayerId());
		return ps.execute();
		//return false;
}
	public List<Team> getAllTeam() throws Exception{
		List<Team> li=new ArrayList<Team>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from team");
	
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Team(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getString(4), rs.getInt(5)));
			
		}
		return li;
}
}