package com.ltts.demo.model;

public class Player {
	
	private int playerid;
	private String playername;
	private String country;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int playerid, String playername, String country) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.country = country;
	}
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", country=" + country + "]";
	}

}
