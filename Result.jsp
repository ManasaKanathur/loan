<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page import= "java.sql.Connection"%>
<%@ page import= "java.sql.DriverManager"%>

<%@ page import= "java.sql.PreparedStatement"%>
<%@ page import= "java.sql.ResultSet"%>
<%@ page import= "java.sql.SQLException"%>
<%@ page import= "java.sql.Statement"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> </title>
</head>
<body>

   <h1 style="text-align:center">Defaulters(1) and Nondefaulters(0)</h1>
   
    <div align="center">
        
      <table border="1" style="padding:10px">
        
        
            
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Member Id</th>
                <th>Loan Status</th>
                
            </tr>    
          


<%
    
    
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/loan";
       String username="root";
       String password="manasa1997";
       String query="select * from result";
       Connection conn=DriverManager.getConnection(url, username, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       for(; rs.next(); )
       {
         
 %>
           <tr> 
            
 			<td><%=rs.getString("FirstName")%></td>
 			<td><%=rs.getString("LastName")%></td>
 			<td><%=rs.getString("member_id")%></td>
 			<td><%=rs.getString("loan_status")%></td>
 			
 		   </tr>	
		    
  
   <%
       }
   %>
   
     </table>
     
     
     
   <% 
        rs.close();
        stmt.close();
        conn.close();
   
  
   %>   
   
   <%
   String sql = "DELETE FROM result";
	
	//connect();
	   Class.forName("com.mysql.jdbc.Driver");
       String ur="jdbc:mysql://localhost:3306/loan";
       String usernam="root";
       String passwor="manasa1997";
       String quer="select * from result";
       Connection con=DriverManager.getConnection(ur, usernam, passwor);
	
	PreparedStatement statement = con.prepareStatement(sql);
	statement.executeUpdate(sql);
	
	//statement.executeUpdate();
	statement.close();
	
	
	%>
         
       
 </div>


  
         
       

</body>
</html>