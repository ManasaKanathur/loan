package org.loan.servlets;

import org.loan.businesslayer.*;
import org.loan.database.userDB;

import java.io.IOException;
//import java.util.HashMap;
//import java.io.PrintWriter;
//import java.util.Map;
//import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

//import org.banktest.bl.userBL;;

/**
* Servlet implementation class RetrieveInfo
*/
@WebServlet("/RetrieveInfo")
public class RetrieveInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
  /**
   * @see HttpServlet#HttpServlet()
   */
  public RetrieveInfo() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		// https://stackoverflow.com/questions/15398930/differences-between-attributes-in-request-session-and-servletcontext
		// Understand when to save objects in ServletContext, Session and Request 
		// 1) ServletContext is available to servlets and jsps
		// 2) Session is available to only those servlets that are involved.
		// 3) Request object is best when data needs to be shared across servlets and forwarded to
		     // other servlets or jsps
		     // We will use Request object to save the map as this is not required after the 
		     // response is sent to browser.
		
		// Use Session object to save a HashMap and use the HashMap to pass data to JSP page.
	    //Map<String, String> messages = new HashMap<String, String>();
	    //request.setAttribute("msg-hash-map", messages);	
		
		String firstName = request.getParameter("firstname");
		//if (firstName.length() <= 0)
			//messages.put("firstname-msg", "please enter a valid firstname. \n");
		
		String lastName = request.getParameter("lastname");
		//if (lastName.length() <= 0)
		 // messages.put("lastname-msg", "please enter a valid lastname. \n");
		
		String DOB = request.getParameter("dateofbirth");
		// if (DOB.length() <= 0)
			//messages.put("dob-msg", "please enter a valid date of birth. \n");
		
		
		String Phno = request.getParameter("phonenumber");
		String emailid = request.getParameter("email-id");
		String address = request.getParameter("address");
		String Fathersname = request.getParameter("fathersname");
		String Mothersname = request.getParameter("Mothersname");
		String Aadharno = request.getParameter("Aadharnumber");
		String Accno = request.getParameter("Accountnumber");
		String Panno = request.getParameter("Pancardnumber");
		String Memid = request.getParameter("memberid");
		String Loanamt =request.getParameter("loanamt");
		String Fundedamt =request.getParameter("fundedamt");
		String Fundedamtinv = request.getParameter("funded_amnt_inv");
		String term = request.getParameter("loan");
		String BatchEnrolled = request.getParameter("batch_enrolled");
		String IntRate = request.getParameter("int_rate");
		String Grade =request.getParameter("grade");
		String Subgrade = request.getParameter("subgrade");
		String EmpTitle = request.getParameter("emp_title");
		String EmpLen = request.getParameter("emp_len");
		String Ownership = request.getParameter("onwership");
		String Salary =request.getParameter("sal");
		String incstat = request.getParameter("verification");
		String PaymentPlan = request.getParameter("paymentplan");
		String LoanDescription = request.getParameter("desc");
		String Purpose = request.getParameter("purpose");
		String Title = request.getParameter("title");
		String Zipcode =request.getParameter("zip");
		String Addr_state = request.getParameter("state");
		String Dti = request.getParameter("dti");
		String Delinq = request.getParameter("delinq");
		String Inq = request.getParameter("inq");
		String LastDelinq = request.getParameter("last_delinq");
		String MonthsSinceLastRecord = request.getParameter("mths_since_last_record");
		String OpenCreditLine = request.getParameter("open_acc");
		String DerPublicRecord = request.getParameter("der");
		String RevolvingBalance = request.getParameter("revol_bal");
		String RevolUtil = request.getParameter("revol_util");
		String TotalAcc = request.getParameter("total_acc");
		String UniqueListing = request.getParameter("uni");
		String InterestRecieved = request.getParameter("total_rec_int");
		String LateFee = request.getParameter("total_rec_late_fee");
		String PostChargeOffGrossRec = request.getParameter("recoveries");
		String PostChargeOffCol = request.getParameter("collection_recovery_fee");

		//String MedCollection = request.getParameter("collection_12_mths_ex_med");
		//String MthsSince90Day = request.getParameter("mths_since_last_major_derog");
		String Application_type = request.getParameter("appl");
		//String VerificationStatusJoint = request.getParameter("verification_status_joint");
		String LastWeekPay = request.getParameter("last_week_pay");
		String AccDelinq = request.getParameter("acc_now_delinq");
		String TotalCollAmt = request.getParameter("tot_coll_amt");
		String TotalCurrBal = request.getParameter("tot_cur_bal");
		//String TotalRevCredLimit = request.getParameter("total_rev_hi_limit");
		
	   // PrintWriter out = response.getWriter(); 
		 
	    
		if(firstName.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		
		else if(lastName.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		} 
		else if(DOB.isEmpty()) { request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		
		else if( Phno.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(emailid.isEmpty()) { request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(address.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Fathersname.isEmpty()) {
			request.setAttribute("FromServlet", "YES");
			RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
			disp.forward(request, response);
			
		}
		else if(Mothersname.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Aadharno.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Accno.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Panno.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Memid.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Loanamt.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Fundedamt.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Fundedamtinv.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(BatchEnrolled.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(IntRate.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Grade.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Subgrade.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(EmpTitle.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(EmpLen.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Ownership.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Salary.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(incstat.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(PaymentPlan.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(LoanDescription.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Purpose.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Title.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Zipcode.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Addr_state.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Dti.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Delinq.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(Inq.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(LastDelinq.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(MonthsSinceLastRecord.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(OpenCreditLine.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(DerPublicRecord.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(RevolvingBalance.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(RevolUtil.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(TotalAcc.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(UniqueListing.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		} 
		else if(InterestRecieved.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(LateFee.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(PostChargeOffGrossRec.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		
		
		else if(PostChargeOffCol.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		
		}
		
		/*else if(MedCollection.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(MthsSince90Day.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}*/
		else if(Application_type.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}/*
		else if(VerificationStatusJoint.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}*/
		else if(LastWeekPay.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(AccDelinq.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(TotalCollAmt.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		else if(TotalCurrBal.isEmpty()) {request.setAttribute("FromServlet", "YES");
		RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
		disp.forward(request, response);
		}
		/*else if(TotalRevCredLimit.isEmpty())
     { 
			
			// UNDERSTAND THE DIFFERENCE BETWEEN REDIRECT AND FORWARD.
			// https://stackoverflow.com/questions/6068891/difference-between-jsp-forward-and-redirect
			// REDIRECT GOES BACK TO BROWSER AND ANOTHER CALL IS MADE TO THE NEW URL
			// So Everything like your parameters is lost.
		    // FORWARD IS AN INTERNAL THING THAT HAPPENS ON THE SERVER SIDE.
			// CONTROL IS TRANSFERRED TO ANOTHER SERVLET to JSP, WITH EVERYTHING BEING THE SAME.
			// Browser is not involved. 
			
			// Set an attribute in request object to indicate this is a forward and not a 
			// new request to JSP form.
			request.setAttribute("FromServlet", "YES");
			RequestDispatcher disp = request.getRequestDispatcher("Form.jsp");
			disp.forward(request, response);
			
	        //response.sendRedirect("Form.jsp");
			//getServletContext().getRequestDispatcher("http://localhost:8004/LoanValidator/Form.jsp").forward(request, response);
	   }*/
		
				
		else
		{	
			
		userBL user = new userBL();
		user.setFname(firstName);
		user.setLname(lastName);
		user.setDob(DOB);
		user.setPhno(Phno);
		user.setEid(emailid);
		user.setAdd(address);
		user.setFathern(Fathersname);
		user.setMothern(Mothersname);
		long An = Long.parseLong(Aadharno);
		user.setAadhar(An);
		long acn = Long.parseLong(Accno);
		user.setAccno(acn);
		user.setPan(Panno);
		long mi = Long.parseLong(Memid);
		user.setMemid(mi);
		long la = Long.parseLong(Loanamt);
		user.setLoanamt_mem(la);
		long lb = Long.parseLong(Fundedamt);
		user.setLoanamt_bank(lb);
		long li = Long.parseLong(Fundedamtinv);
		user.setLoanamt_invs(li);
		int tm = Integer.parseInt(term);
		user.setTerm(tm);
		user.setBatchno(BatchEnrolled);
		float rt = Float.parseFloat(IntRate);
		user.setInt_rate(rt);
		user.setGrade(Grade);
		user.setSubgrade(Subgrade);
		user.setJobtitle(EmpTitle);
		int el = Integer.parseInt(EmpLen);
		user.setEmp_len(el);
		user.setHome_own(Ownership);
		long inc = Long.parseLong(Salary);
		user.setIncome(inc);
		user.setInc_status(incstat);
		user.setPay_plan(PaymentPlan);
		user.setLoan_des(LoanDescription);
		user.setPurose(Purpose);
		user.setLoantitle(Title);
		long zp = Long.parseLong(Zipcode);
		user.setZip(zp);
		user.setAddr_status(Addr_state);
		int dt = Integer.parseInt(Dti);
		user.setDti(dt);
		int in = Integer.parseInt(Inq);
	    user.setInq(in);
	    int dl = Integer.parseInt(Delinq);
	    user.setDelinq(dl);
	    int ld = Integer.parseInt(LastDelinq);
	    user.setMon_delinq(ld);
	    int ms = Integer.parseInt(MonthsSinceLastRecord);
	    user.setMon_pubrec(ms);
	    int oc = Integer.parseInt(OpenCreditLine);
	    user.setOpen_cred(oc);
	    int dp = Integer.parseInt(DerPublicRecord);
      user.setDer_pubrec(dp);	
      long rb = Long.parseLong(RevolvingBalance);
      user.setRev_bal(rb);
      long ru = Long.parseLong(RevolUtil);
      user.setRev_util(ru);
      long ta = Long.parseLong(TotalAcc);
      user.setTotal_acc(ta);
      user.setUni_stat(UniqueListing);
      float ir = Float.parseFloat(InterestRecieved);
      user.setTotal_rec_int(ir);
      float lf = Float.parseFloat(LateFee);
      user.setTotal_late_fee(lf);
      long pc = Long.parseLong(PostChargeOffGrossRec);
      user.setRecoveries(pc);
      long po = Long.parseLong(PostChargeOffCol);
      user.setCollection(po);
      //long mc = Long.parseLong(MedCollection);
      //user.setCollection_12_med(mc);
     //int wr = Integer.parseInt(MthsSince90Day);
      //user.setWorst_rating(wr);
       user.setAppl_type(Application_type);
      //user.setVerif_joint(VerificationStatusJoint);
      int lw = Integer.parseInt(LastWeekPay);
      user.setLast_week_pay(lw);
      int ad = Integer.parseInt(AccDelinq);
      user.setAcc_now_delinq(ad);
      long tc = Long.parseLong(TotalCollAmt);
      user.setTotal_coll_amnt(tc);
      long tb = Long.parseLong(TotalCurrBal);
      user.setTotal_cur_bal(tb);
     // long tr = Long.parseLong(TotalRevCredLimit);
     // user.setTotal_rev_limit(tr);
      
      
      userDB u = new userDB();
      boolean ans = false;
      try {
		ans = u.insertUser(user);
		if(ans==true)
		 {RequestDispatcher disp = request.getRequestDispatcher("userinfoerror.jsp");
	      disp.forward(request, response);}
	      
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
     
      
      
		}
	    
	}
         
	

}
	

