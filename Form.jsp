

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Details</title>
</head>
<body>

<%
	// See top of file where page directives are used for importing java classes - Map and HashMap.

    // Write Java code and retrieve saved values.
    // Since the form uses these variables, initialize it to blank, so it works fine for 
    // normal case and also for the validation failure case
    String firstName="";
    String lastName="";
    String DOB="";
	String phno="";
	String eid="";
	String add="";
	String fathern="";
	String mothern="";
    String aadhar="";
	String accno="";
	String pan="";
    String memid="";
	String loanamt_mem="";
	String loanamt_bank="";
	String loanamt_invs="";
	String term="";
	String batchno="";
	String int_rate="";
	String grade="";
	String subgrade="";
	String jobtitle="";
	String emp_len="";
	String home_own="";
	String income="";
	String inc_status="";
	String pay_plan="";
	String loan_des="";
	String purose="";
	String loantitle="";
	String zip="";
	String addr_status="";
	String dti="";
	String delinq="";
	String inq="";
	String mon_delinq="";
	String mon_pubrec="";
	String open_cred="";
	String der_pubrec="";
	String rev_bal="";
	String rev_util="";
	String total_acc="";
	String uni_stat="";
	String total_rec_int="";
	String total_late_fee="";
	String recoveries="";
	String collection="";
	//String collection_12_med="";
	//String worst_rating="";
	String appl_type="";
	//String verif_joint="";
	String last_week_pay="";
	String acc_now_delinq="";
	String total_coll_amnt="";
	String total_cur_bal="";
	//String total_rev_limit="";
    
    boolean isServletForward = false;
	boolean isOk = true;
	String errorMsg = "";
	String fromServlet = (String)request.getAttribute("FromServlet");
	if ( (fromServlet != null) && (0 == fromServlet.compareTo("YES")) )
	{
		isServletForward = true;
		
		// We know we have come from servlet and not a new request.
		// Get the map (created in servlet) from request object.
		//Map<String, String> messages = (HashMap<String, String>)(request.getAttribute("msg-hash-map"));
		//if //(messages != null) {
			isOk = false;
			
			// Coming back to JSP from servlet means there are validation failures.
			// So restore JSP from variables to user entered values.
			// So we can initialize the above java variables with values the user has passed before.
			// These variables are used by jsp using the value attribute which should defined 
			// to use the java variables.
			// Request and Response are implicit variables in JSP and are readily available.
			// Let us read the values from request parameter and assign it to java variables.
			firstName = request.getParameter("firstname"); //"Raghu"
			lastName = request.getParameter("lastname");
			DOB = request.getParameter("dateofbirth");	
			phno= request.getParameter("phonenumber");
		     eid=request.getParameter("email-id");
			 add=request.getParameter("address");
			 fathern=request.getParameter("fathersname");
			 mothern=request.getParameter("Mothersname");
		     aadhar=request.getParameter("Aadharnumber");
		     accno=request.getParameter("Accountnumber");
			 pan=request.getParameter("Pancardnumber");
		     memid=request.getParameter("memberid");
			 loanamt_mem=request.getParameter("loanamt");
			 loanamt_bank=request.getParameter("fundedamt");
			 loanamt_invs=request.getParameter("funded_amnt_inv");
			 term=request.getParameter("loan");
			 batchno=request.getParameter("batch_enrolled");
			 int_rate=request.getParameter("int_rate");
			 grade=request.getParameter("grade");
			 subgrade=request.getParameter("subgrade");
			 jobtitle=request.getParameter("emp_title");
			 emp_len=request.getParameter("emp_len");
			 home_own=request.getParameter("ownership");
			 income=request.getParameter("sal");
			 inc_status=request.getParameter("verification");
			 pay_plan=request.getParameter("paymentplan");
			 loan_des=request.getParameter("desc");
			 purose=request.getParameter("purpose");
			 loantitle=request.getParameter("title");
			 zip=request.getParameter("zip");
			 addr_status=request.getParameter("state");
			 dti=request.getParameter("dti");
			 delinq=request.getParameter("delinq");
			 inq=request.getParameter("inq");
			 mon_delinq=request.getParameter("last_delinq");
			 mon_pubrec=request.getParameter("mths_since_last_record");
			 open_cred=request.getParameter("open_acc");
			 der_pubrec=request.getParameter("der");
			 rev_bal=request.getParameter("revol_bal");
			 rev_util=request.getParameter("revol_util");
			 total_acc=request.getParameter("total_acc");
			 uni_stat=request.getParameter("uni");
			 total_rec_int=request.getParameter("total_rec_int");
			 total_late_fee=request.getParameter("total_rec_late_fee");
			 recoveries=request.getParameter("recoveries");
			 collection=request.getParameter("collection_recovery_fee");
			 //collection_12_med=request.getParameter("collections_12_mths_ex_med");
			 //worst_rating=request.getParameter("mths_since_last_major_derog");
			 appl_type=request.getParameter("appl");
			 //verif_joint=request.getParameter("verification_status_joint");
			 last_week_pay=request.getParameter("last_week_pay");
			 acc_now_delinq=request.getParameter("acc_now_delinq");
			 total_coll_amnt=request.getParameter("tot_coll_amt");
			 total_cur_bal=request.getParameter("tot_cur_bal");
			 //total_rev_limit=request.getParameter("total_rev_hi_lim");
			
			// Get all the error message from the HashMap and write it to a hidden form field.
			// Use the isOK boolean to to make it hidden or visible.
			// Use string builder to build the errorMsg string from all the error messages.
			//errorMsg = messages.get("firstname-msg");
			// TODO
			// TODO
			
		}
	//}
	
    // How to use Java code to set form fields to Java variables
    // See below on how the value attribute is used for firstname and other form fields
%>

<%
    //See below for conditionally emitting html code using java
    if (isServletForward)
    {
		if (! isOk) {
				out.println("VALIDATION FAILED !");
				out.println("");
			if ( (errorMsg != null) && (errorMsg.length() > 0) ) {
				out.println(errorMsg);
			}
		}
	   // else {
	         //out.println("VALIDATION PASSED ! \n");
	         //out.println("");
	          //response.sendRedirect("userinfoerror.jsp");
	    //}
    }
%>

Enter Details Of Loan Applicant
<br />
<br />

<form action="RetrieveInfo" method="post">   
First Name: <input type= "text" name="firstname" value="<%=firstName%>">
<br />
<br />
Last Name: <input type="text" name="lastname" value="<%=lastName%>">
<br />
<br />
DOB: <input type = "text" name="dateofbirth" value="<%=DOB%>">
<br />
<br />
Phno: <input type= "text" name="phonenumber" value="<%=phno%>">
<br />
<br />
Email-id: <input type= "text" name="email-id" value="<%=eid%>">
<br />
<br />
Address: <input type= "text" name="address" value="<%=add%>">
<br />
<br />
Fathers Name: <input type= "text" name="fathersname" value="<%=fathern%>">
<br />
<br />
Mothers Name: <input type= "text" name="Mothersname" value="<%=mothern%>">
<br />
<br />
Aadhar no: <input type= "text" name="Aadharnumber" value="<%=aadhar%>">
<br />
<br />
Account no: <input type= "text" name="Accountnumber" value="<%=accno%>">
<br />
<br />
Pan no: <input type= "text" name="Pancardnumber" value="<%=pan%>">
<br />
<br />
member_id: <input type= "text" name="memberid" value="<%=memid%>">
<br />
<br />
loan_amnt applied by member: <input type= "text" name="loanamt" value="<%=loanamt_mem %>">
<br />
<br />
loan_amt sanctioned by bank: <input type= "text" name="fundedamt" value="<%=loanamt_bank%>">
<br />
<br />
loan_amt sanctioned by investors: <input type= "text" name="funded_amnt_inv" value="<%=loanamt_invs%>">
<br />
<br /> 
term of loan: <select name= "loan">
<option value="36">36</option>
<option value="50">50</option>
</select>

<br />
<br />
batch numbers allotted to members: <input type= "text" name="batch_enrolled" value="<%=batchno%>">
<br />
<br />
interest rate on loan: <input type= "text" name="int_rate" value="<%=int_rate%>">
<br />
<br />
grade assigned by the bank: <select name="grade">
<option value="A">A</option>
<option value="B">B</option>
<option value="C">C</option>
<option value="D">D</option>
<option value="E">E</option>
<option value="F">F</option>
</select>
<br />
<br />

sub_grade assigned by the bank: <input type= "text" name="subgrade" value="<%=subgrade%>">
<br />
<br />
job title of member: <input type= "text" name="emp_title" value="<%=jobtitle%>">
<br />
<br />
employment length: <input type= "text" name="emp_len" value="<%=emp_len%>">
<br />
<br />
status of home ownership: <select name= "onwership" >
<option value="OWN">OWN</option>
<option value="MORTGAGE">MORTGAGE</option>
<option value="RENT">RENT</option>
</select>
<br />
<br />
annual income: <input type= "text" name="sal" value="<%=income%>">
<br />
<br />
status of income verified by the bank: <select name= "verification" >
<option value="v">Verified</option>
<option value="NV">Source Verified</option>
<option value="NV">Not Verified</option>
</select>
<br />
<br />
pymnt_plan: <input type= "radio" name="paymentplan" value="n">n
<br />
<br />
loan description provided by member: <input type= "text" name="desc" value="<%=loan_des%>">
<br />
<br /> 
purpose of loan: <input type= "text" name="purpose" value="<%=purose%>">
<br />
<br /> 
loan title provided by member: <input type= "text" name="title" value="<%=loantitle%>">
<br />
<br /> 
first three digits of area zipcode of member: <input type= "text" name="zip" value="<%=zip%>">
<br />
<br /> 
addr_state: <input type= "text" name="state" value="<%=addr_status%>">
<br />
<br /> 
dti: <input type= "text" name="dti" value="<%=dti%>">
<br />
<br />
number of 30+ days delinquency in past 2 years: <input type= "radio" value="0" name="delinq">0
<input type= "radio" value="1" name="delinq">1
<br />
<br />
number of inquiries in last 6 months: <input type= "radio" value="0" name="inq">0
<input type= "radio" value="1" name="inq">1
<br />
<br />
number of months since last delinq: <input type= "text" name="last_delinq" value="<%=mon_delinq%>">
<br />
<br /> 
number of months since last public record: <input type= "text" name="mths_since_last_record" value="<%=mon_pubrec%>">
<br />
<br /> 
number of open credit line in member's credit line: <input type= "text" name="open_acc" value="<%=open_cred%>">
<br />
<br /> 
number of derogatory public records: <input type= "radio" value="0" name="der">0
<input type= "radio" value="1" name="der">1
<br />
<br />
total credit revolving balance: <input type= "text" name="revol_bal" value="<%=rev_bal%>">
<br />
<br /> 
amount of credit a member is using relative to revol_bal: <input type= "text" name="revol_util" value="<%=rev_util%>">
<br />
<br /> 
total number of credit lines available in members credit line: <input type= "text" name="total_acc" value="<%=total_acc%>">
<br />
<br /> 
unique listing status of the loan: <input type= "radio" value="0" name="uni">f
<input type= "radio" value="1" name="uni">w
<br />
<br /> 
interest received till date: <input type= "text" name="total_rec_int" value="<%=total_rec_int%>">
<br />
<br /> 
Late fee received till date: <input type= "text" name="total_rec_late_fee" value="<%=total_late_fee%>">
<br />
<br /> 
post charge off gross recovery: <input type= "text" name="recoveries" value="<%=recoveries%>">
<br />
<br /> 
post charge off collection fee: <input type= "text" name="collection_recovery_fee" value="<%=collection%>">
<br />
<br /> 
application_type: <input type= "radio" value="ind" name="appl">INDUVIDUAL
<input type= "radio" value="jnt" name="appl">JOINT
<br />
<br />
how long a member has paid EMI after batch enrolled(weeks): <input type= "text" name="last_week_pay"  value="<%=last_week_pay%>">
<br /> 
<br />
number of accounts on which the member is delinquent: <input type= "text" name="acc_now_delinq"  value="<%=acc_now_delinq%>">
<br /> 
<br />
total collection amount ever owed: <input type= "text" name="tot_coll_amt" value="<%=total_coll_amnt%>">
<br /> 
<br />
total current balance of all accounts: <input type= "text" name="tot_cur_bal"  value="<%=total_cur_bal%>">
<br /> 
<br />

<input type="submit" value="Submit" />

</form>

</body>
</html>
