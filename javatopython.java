package org.loan.communication;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class javatopython {

	
	public String jdbcURL="jdbc:mysql://localhost:3306/loan";
	public String jdbcUsername="root";
	public String jdbcPassword= "manasa1997";
	public Connection jdbcConnection;
	
	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
		}
			jdbcConnection = DriverManager.getConnection(
										jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	
	public void communicate() throws SQLException, IOException
	{
	   
		
		String sql = "UPDATE polling SET status=\"pending\"";
	    connect();
	
	//PreparedStatement statement = jdbcConnection.prepareStatement(sql);
	PreparedStatement statement = jdbcConnection.prepareStatement(sql);

	   
	   statement.executeUpdate();
	
	   String stat = "pending";
	
	
	
	
	while(stat.equals("pending"))
	{
		
		String query = "SELECT * FROM polling";
		PreparedStatement st = jdbcConnection.prepareStatement(query);
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
		   String fname = rs.getString("status");
	       stat = fname;
	     }
	    rs.close();
	}
	
	
	
    if(stat.equals("inprogress"))
    {
    	
    	String d = "UPDATE polling SET status=\"completed\" where status=\"inprogress\"";
    	PreparedStatement ps = jdbcConnection.prepareStatement(d);
    	ps.executeUpdate();
 
    }
   
 
    statement.executeUpdate();
   
   statement.close();
	disconnect();
	
	
	}

	   
}
