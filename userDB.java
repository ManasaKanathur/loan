package org.loan.database;
import org.loan.businesslayer.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userDB {
	
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
	
	
	public boolean insertUser(userBL u) throws SQLException {
		String sql = "INSERT INTO applications(Firstname,Lastnamae,phno,email,address,fatherName,MotherName,aadhar,Accno,pan,memid,loanamt_mem,loanamt_bank,loanamt_inv,term,batchno,int_rate,grade,Subgrade,JobTitle,emp_len,HomeOwnership,income,IncomeStatus,PaymentPlan,LoanDescription,Purpose,LoanTitle,zip,AddressState,dti,delinq,inq,mon_delinq,mon_pubrec,open_cred,der_pubrec,RevolvingBalance,RevolveUtil,TotalAcc,Uni_stat,TotalRecInt,TotalLateFee,Recoveries,Collection,ApplType,LastWeekPay,AccNowDelinq,TotalCollAmnt,TotalCurrBal) VALUES (?, ?, ?,?, ?, ?,?,?,?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?,?, ?, ?,?, ?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		//statement.executeUpdate(sql);
		statement.setString(1, u.getFname());
		statement.setString(2, u.getLname());
		//statement.setString(3, u.getDob());
		statement.setString(3, u.getPhno());
		statement.setString(4, u.getEid());
		statement.setString(5, u.getAdd());
		statement.setString(6, u.getFathern());
		statement.setString(7, u.getMothern());
		statement.setLong(8, u.getAadhar());
		statement.setLong(9, u.getAccno());
		statement.setString(10, u.getPan());
		statement.setLong(11, u.getMemid());
		statement.setLong(12, u.getLoanamt_mem());
		statement.setLong(13, u.getLoanamt_bank());
		statement.setLong(14, u.getLoanamt_invs());
		statement.setInt(15, u.getTerm());
		statement.setString(16, u.getBatchno());
		statement.setFloat(17, u.getInt_rate());
		statement.setString(18,u.getGrade());
		statement.setString(19,u.getSubgrade());
		statement.setString(20, u.getJobtitle());
		statement.setInt(21, u.getEmp_len());
		statement.setString(22,u.getHome_own());
		statement.setLong(23, u.getIncome());
		statement.setString(24,u.getInc_status());
		statement.setString(25,u.getPay_plan());
		statement.setString(26,u.getLoan_des());
		statement.setString(27,u.getPurose());
		statement.setString(28,u.getLoantitle());
		statement.setLong(29,u.getZip());
		statement.setString(30,u.getAddr_status());
		statement.setInt(31,u.getDti());
		statement.setInt(32,u.getDelinq());
		statement.setInt(33,u.getInq());
		statement.setInt(34,u.getMon_delinq());
		statement.setInt(35,u.getMon_pubrec());
		statement.setInt(36,u.getOpen_cred());
		statement.setInt(37,u.getDer_pubrec());
		statement.setLong(38,u.getRev_bal());
		statement.setFloat(39,u.getRev_util());
		statement.setLong(40,u.getTotal_acc());
		statement.setString(41, u.getUni_stat());
		statement.setFloat(42,u.getTotal_rec_int());
		statement.setFloat(43,u.getTotal_late_fee());
		statement.setLong(44,u.getRecoveries());
		statement.setLong(45,u.getCollection());
		//statement.setLong(46,u.getCollection_12_med());
		//statement.setInt(47,u.getWorst_rating());
		statement.setString(46, u.getAppl_type());
		//statement.setString(49,u.getVerif_joint());
		statement.setInt(47, u.getLast_week_pay());
		statement.setInt(48, u.getAcc_now_delinq());
		statement.setLong(49,u.getTotal_coll_amnt());
		statement.setLong(50,u.getTotal_cur_bal());
		//statement.setLong(54,u.getTotal_rev_limit());
	
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	
	
	public boolean insertexisting(userBL u) throws SQLException {
		String sql = "INSERT INTO existing(Firstname,Lastnamae,phno,email,address,fatherName,MotherName,aadhar,Accno,pan,memid,loanamt_mem,loanamt_bank,loanamt_inv,term,batchno,int_rate,grade,Subgrade,JobTitle,emp_len,HomeOwnership,income,IncomeStatus,PaymentPlan,LoanDescription,Purpose,LoanTitle,zip,AddressState,dti,delinq,inq,mon_delinq,mon_pubrec,open_cred,der_pubrec,RevolvingBalance,RevolveUtil,TotalAcc,Uni_stat,TotalRecInt,TotalLateFee,Recoveries,Collection,ApplType,LastWeekPay,AccNowDelinq,TotalCollAmnt,TotalCurrBal,loanstat) VALUES (?, ?, ?,?, ?, ?,?,?,?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?, ?,?, ?,?, ?, ?,?, ?,?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		//statement.executeUpdate(sql);
		statement.setString(1, u.getFname());
		statement.setString(2, u.getLname());
		//statement.setString(3, u.getDob());
		statement.setString(3, u.getPhno());
		statement.setString(4, u.getEid());
		statement.setString(5, u.getAdd());
		statement.setString(6, u.getFathern());
		statement.setString(7, u.getMothern());
		statement.setLong(8, u.getAadhar());
		statement.setLong(9, u.getAccno());
		statement.setString(10, u.getPan());
		statement.setLong(11, u.getMemid());
		statement.setLong(12, u.getLoanamt_mem());
		statement.setLong(13, u.getLoanamt_bank());
		statement.setLong(14, u.getLoanamt_invs());
		statement.setInt(15, u.getTerm());
		statement.setString(16, u.getBatchno());
		statement.setFloat(17, u.getInt_rate());
		statement.setString(18,u.getGrade());
		statement.setString(19,u.getSubgrade());
		statement.setString(20, u.getJobtitle());
		statement.setInt(21, u.getEmp_len());
		statement.setString(22,u.getHome_own());
		statement.setLong(23, u.getIncome());
		statement.setString(24,u.getInc_status());
		statement.setString(25,u.getPay_plan());
		statement.setString(26,u.getLoan_des());
		statement.setString(27,u.getPurose());
		statement.setString(28,u.getLoantitle());
		statement.setLong(29,u.getZip());
		statement.setString(30,u.getAddr_status());
		statement.setInt(31,u.getDti());
		statement.setInt(32,u.getDelinq());
		statement.setInt(33,u.getInq());
		statement.setInt(34,u.getMon_delinq());
		statement.setInt(35,u.getMon_pubrec());
		statement.setInt(36,u.getOpen_cred());
		statement.setInt(37,u.getDer_pubrec());
		statement.setLong(38,u.getRev_bal());
		statement.setFloat(39,u.getRev_util());
		statement.setLong(40,u.getTotal_acc());
		statement.setString(41, u.getUni_stat());
		statement.setFloat(42,u.getTotal_rec_int());
		statement.setFloat(43,u.getTotal_late_fee());
		statement.setLong(44,u.getRecoveries());
		statement.setLong(45,u.getCollection());
		//statement.setLong(46,u.getCollection_12_med());
		//statement.setInt(47,u.getWorst_rating());
		statement.setString(46, u.getAppl_type());
		//statement.setString(49,u.getVerif_joint());
		statement.setInt(47, u.getLast_week_pay());
		statement.setInt(48, u.getAcc_now_delinq());
		statement.setLong(49,u.getTotal_coll_amnt());
		statement.setLong(50,u.getTotal_cur_bal());
		//statement.setLong(54,u.getTotal_rev_limit());
	
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	
	
	/*public List<userBL> listAllUsers() throws SQLException {
		List<userBL> listUsers = new ArrayList<>();
		
		String sql = "SELECT * FROM applications";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			String fname = resultSet.getString("Firstname");
			String lname = resultSet.getString("Lastnamae");
			//Date dob = resultSet.getString("dob");
			String phno = resultSet.getString("phno");
			String em = resultSet.getString("email");
			String add = resultSet.getString("address");
			String fn  = resultSet.getString("fatherName");
		    String mn = resultSet.getString("MotherName");
		    long aadhar = resultSet.getLong("aadhar");
		    long acc = resultSet.getLong("Accno");
		    String pan = resultSet.getString("pan");
		    long memid = resultSet.getLong("memid");
		    long lnmem = resultSet.getLong("loanamt_mem");
		    long lnbank = resultSet.getLong("loanamt_bank");
		    long lninv = resultSet.getLong("loanamt_inv");
		    int term = resultSet.getInt("term");
		    String batchno = resultSet.getString("batchno");
		    float intrate = resultSet.getLong("int_rate");
		    String grade = resultSet.getString("grade");
		    String subgrade = resultSet.getString("Subgrade");
		    String jobtitle = resultSet.getString("Jobtitle");
		    int emplen = resultSet.getInt("emp_len");
		    String homeown = resultSet.getString("HomeOwnership");
		    long income = resultSet.getLong("income");
		    String incstat = resultSet.getString("IncomeStatus");
		    String PaymentPlan = resultSet.getString("PaymentPlan");
		    String loandes = resultSet.getString("LoanDescription");
		    String purp = resultSet.getString("Purpose");
		    String loantit = resultSet.getString("LoanTitle");
		    long zip = resultSet.getLong("zip");
		    String addst = resultSet.getString("AddressState");
		    int dti = resultSet.getInt("dti");
		    int delinq = resultSet.getInt("delinq");
		    int inq = resultSet.getInt("inq");
		    int mon_delinq = resultSet.getInt("mon_delinq");
		    int mon_pubrec = resultSet.getInt("mon_pubrec");
		    int open_rec = resultSet.getInt("open_cred");
		    int der_pubrec = resultSet.getInt("der_pubrec");
		    long revbal = resultSet.getLong("RevolvingBalance");
		    long revolveutil = resultSet.getLong("RevolvingUtil");
		    long totalacc = resultSet.getLong("TotalAcc");
		    String unist = resultSet.getString("Uni_stat");
		    float totrecint = resultSet.getLong("TotalRecInt");
		    float totlatefee = resultSet.getLong("TotalLateFee");
		    long rec = resultSet.getLong("Recoveries");
		    long coll = resultSet.getLong("Collection");
		   // long coll12med = resultSet.getLong("Collection12Med");
		    //int worstrat = resultSet.getInt("WorstRating");
		    String appltype = resultSet.getString("ApplType");
		    //String yerifJoint = resultSet.getString("YerifJoint");
		    int LastWeekPay = resultSet.getInt("LastWeekPay");
		    int accnowdelinq = resultSet.getInt("AccNowDelinq");
		    long totalcollamnt = resultSet.getLong("TotalCollAmnt");
		   // long totalcuramnt = resultSet.getLong("TotalCurrAmnt");
		    long totalcurrBal = resultSet.getLong("TotalCurrAmnt");
		    //long totalrevbal = resultSet.getLong("TotalRevBal");
		    
		    userBL u = new userBL(fname,lname,phno,em,add,fn,mn,aadhar,acc,pan,memid,lnmem,lnbank,lninv,term,batchno,intrate,grade,subgrade,jobtitle,emplen,homeown,income,incstat,PaymentPlan,loandes,purp,loantit,zip,addst,dti,delinq,inq,mon_delinq,mon_pubrec,open_rec,der_pubrec,revbal,revolveutil,totalacc,unist,totrecint,totlatefee,rec,coll,appltype,LastWeekPay,accnowdelinq,totalcollamnt,totalcurrBal);
			listUsers.add(u);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listUsers;
	}
	*/
	
	/*public boolean deleteUser(userBL u)throws SQLException {
		String sql = "DELETE FROM applications where Accno = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setLong(1,u.getAccno());
		
		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowDeleted;		
	}*/
	
	/*public boolean updateBook(Book book) throws SQLException {
		String sql = "UPDATE book SET title = ?, author = ?, price = ?";
		sql += " WHERE book_id = ?";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, book.getTitle());
		statement.setString(2, book.getAuthor());
		statement.setFloat(3, book.getPrice());
		statement.setInt(4, book.getId());
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowUpdated;		
	}*/
	
	/*public Book getBook(int id) throws SQLException {
		Book book = null;
		String sql = "SELECT * FROM book WHERE book_id = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, id);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			String title = resultSet.getString("title");
			String author = resultSet.getString("author");
			float price = resultSet.getFloat("price");
			
			book = new Book(id, title, author, price);
		}
		
		resultSet.close();
		statement.close();
		
		return book;
	}*/
}
	
	


