<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
TeamDao pd=new TeamDao();
List<Team> li=pd.getAllTeam();
%>
<table>
<tr>
<th>Team_id</th>
<th>Teamname Name</th>
<th>Ownername</th>

<th>coachname</th>
<th>playerid</th>

</tr>
<%
for(Team p:li){
%>
<tr>
<td><%=p. getTeamId() %></td>
<td><%=p.getTeamname() %></td>
<td><%=p.getOwnerName() %></td>

<td><%=p.getCoachName() %></td>

<td><%=p. getPlayerId() %></td>

</tr>
<%} %>
</table>

</body>
</html>