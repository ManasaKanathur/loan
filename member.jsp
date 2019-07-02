<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
  response.setHeader("Progma","no-cache");
  //response.setHeader("Expires","0");
  response.setDateHeader("Expires",0);
  //session.invalidate();
  
%>


Welcome!
<br />
<br />

<form action="FirstServlet" method="post">   
<input type="button" value="New Applicant" name="NwApl" onclick="openPage('Form.jsp')"/>  
<br />
<br />
<input type="button" value="View Database" name="PndRq" onclick="openPage('pending.jsp')"/> 
<br /> 
<br />
<input type="button" value="Logout" name="LgOt" onClick="location.href='index.html'"/>
<br />
<br />

</form>  

<script type="text/javascript">
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>


<script type="text/javascript">
window.history.forward();
function noBack(){window.history.forward();}
</script>


</body>

</html>