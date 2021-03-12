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
int id1=Integer.parseInt(request.getParameter("id"));
PlayerDao pd=new PlayerDao();
Player p1=pd.getPlayerById(id1);
%>
<form action="./UpdatePlayerServlet" method="post">
Player ID: <input type="text" value="<%= p1.getPlayer_id() %>" name="pid"><br><br>
Player Name: <input type="text" value="<%= p1.getName() %>" name="pname"><br><br>
Player DOB: <input type="text" value="<%= p1.getDateOfBirth() %>" name="pdob"><br><br>
Player Country: <input type="text" value="<%= p1.getNationality() %>" name="pcountry"><br><br>
Player Skill: <input type="text" value="<%= p1.getSkills() %>" name="pskill"><br><br>
Player Runs: <input type="text" value="<%= p1.getRuns() %>" name="pruns"><br><br>
Player Wickets: <input type="text" value="<%= p1.getWickets() %>" name="pwickets"><br><br>
Player Team Id: <input type="text" value="<%= p1.getTeam_id() %>" name="pwickets"><br><br>
Player Matches: <input type="text" value="<%= p1.getNumber_of_matches() %>" name="pmatch"><br><br>

<input type="submit" value="Update Player">

</form>
</body>
</html>