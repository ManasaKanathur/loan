<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN"
   "http://www.w3.org/TR/html4/strict.dtd">  
<%@ page import=" org.loan.database.*" %>
<%@ page import="org.loan.businesslayer.*" %>
<%@ page import= "java.util.ArrayList"%>
<%@ page import= "java.util.List"%>
<%@ page import= "java.sql.Connection"%>
<%@ page import= "java.sql.DriverManager"%>

<%@ page import= "java.sql.PreparedStatement"%>
<%@ page import= "java.sql.ResultSet"%>
<%@ page import= "java.sql.SQLException"%>
<%@ page import= "java.sql.Statement"%>

<html>
<head>
    <title> </title>
</head>
<body>
        <h1 style="text-align:center">Existing Loan Applicants</h1>
   
        <div align="center">
        
        <table border="1" style="padding:10px">
        
        
            
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone no</th>
                <th>Email id</th>
                <th>Address</th>
                <th>Fathers Name</th>
                <th>Mothers Name</th>
                <th>Aadhar</th>
                <th>Account no</th>
                <th>Pan</th>
                <th>Member id</th>
                <th>Loan amt applied</th>
                <th>Loan amt sanc(bank)</th>
                <th>Loan amt sanc(investors)</th>
                <th>Funded amnt(bank)</th>
                <th>Funded amnt(investors)</th>
                <th>Term</th>
                <th>Interest Rate</th>
                <th>Grade</th>
                <th>Subgrade</th>
                <th>Job</th>
                <th>EmpLength</th>
                <th>Home Ownership</th>
                <th>Annual Income</th>
                <th>StatusIncome</th>
                <th>PaymentPlan</th>
                <th>Loan Description</th>
                <th>LoanPurpose</th>
                <th>LoanTitle</th>
                <th>Zip_code</th>
                <th>Address state</th>
                <th>DTI</th>
                <th>Delinquency2years</th>
                <th>inquiriesNo.</th>
                <th>lastdelinq</th>
                <th>lastpublicrecord</th>
                <th>OpenCredidlines</th>
                <th>DerogatoryPublicRecords</th>
                <th>revolving balance</th>
                <th>Revolving_Util</th>
                <th>Unique Listing status</th>
                <th>Interest recieved</th>
                <th>Late Fee recieved</th>
                <th>Recoveries</th>
                <th>Collection recovery fee</th>
                <th>Application type</th>
                <th>Last week pay</th>
                <th>Accounts Delinquent</th>
                <th>Total collectionamt</th>
                <th>Total currentbalance</th>
                <th>Loan status</th>
</tr>
            
  <%
    try
    {
       Class.forName("com.mysql.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/loan";
       String username="root";
       String password="manasa1997";
       String query="select * from existing";
       Connection conn=DriverManager.getConnection(url, username, password);
       Statement stmt=conn.createStatement();
       ResultSet rs=stmt.executeQuery(query);
       for(; rs.next(); )
       {
   %>
          <tr> 
           
			<td><%=rs.getString("Firstname")%></td>
			<td><%=rs.getString("Lastnamae")%></td>
			<td><%=rs.getString("phno")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getString("address")%></td>
			<td><%=rs.getString("fatherName")%></td>
			<td><%=rs.getString("MotherName")%></td>
			<td><%=rs.getLong("aadhar")%></td>
			<td><%=rs.getLong("Accno")%></td>
			<td><%=rs.getString("pan")%></td>
			<td><%=rs.getLong("memid")%></td>
			<td><%=rs.getLong("loanamt_mem")%></td>
			<td><%=rs.getLong("loanamt_bank")%></td>
			<td><%=rs.getLong("loanamt_inv")%></td>
			<td><%=rs.getInt("term")%></td>
			<td><%=rs.getString("batchno")%></td>
			<td><%=rs.getLong("int_rate")%></td>
		    <td><%=rs.getString("grade")%></td>
			<td><%=rs.getString("Subgrade")%></td>
			<td><%=rs.getString("Jobtitle")%></td>
			<td><%=rs.getInt("emp_len")%></td>
			<td><%=rs.getString("HomeOwnership")%></td>
			<td><%=rs.getLong("income")%></td>
			<td><%=rs.getString("IncomeStatus")%></td>
			<td><%=rs.getString("PaymentPlan")%></td>
			<td><%=rs.getString("LoanDescription")%></td>
			<td><%=rs.getString("Purpose")%></td>
		    <td><%=rs.getString("LoanTitle")%></td>
			<td><%=rs.getLong("zip")%></td>
			<td><%=rs.getString("AddressState")%></td>
			<td><%=rs.getInt("dti")%></td>
			<td><%=rs.getInt("delinq")%></td>
			<td><%=rs.getInt("inq")%></td>
			<td><%=rs.getInt("mon_delinq")%></td>
			<td><%=rs.getInt("mon_pubrec")%></td>
			<td><%=rs.getInt("open_cred")%></td>
			<td><%=rs.getInt("der_pubrec")%></td>
			<td><%=rs.getLong("RevolvingBalance")%></td>
			<td><%=rs.getLong("RevolveUtil")%></td>
			<td><%=rs.getLong("TotalAcc")%></td>
			<td><%=rs.getString("Uni_stat")%></td>
			<td><%=rs.getLong("TotalRecInt")%></td>
			<td><%=rs.getLong("TotalLateFee")%></td>
			<td><%=rs.getLong("Recoveries")%></td>
			<td><%=rs.getLong("Collection")%></td>
			<td><%=rs.getString("ApplType")%></td>
			<td><%=rs.getInt("LastWeekPay")%></td>
			<td><%=rs.getInt("AccNowDelinq")%></td>
			<td><%=rs.getLong("TotalCollAmnt")%></td>
			<td><%=rs.getLong("TotalCurrBal")%></td>
			<td><%=rs.getInt("loanstat")%></td>
			
     	  </tr>	
		    
  
   <%
       }
   %>
   
     </table>
 
   <% 
        rs.close();
        stmt.close();
        conn.close();
   }
   catch(Exception e)
   {
        e.printStackTrace();
   }
   %>   
         
       
    </div> 
    
    
    <input type="button" value="goback" onclick="openPage('member.jsp')"/>  

<script type="text/javascript">
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>
      
</body>
</html> 