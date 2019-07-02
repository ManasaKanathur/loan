package org.loan.businesslayer;


public class userBL {
	
	public userBL(String fname, String lname,String phno, String eid, String add, String fathern,
			String mothern, long aadhar, long accno, String pan, long memid, long loanamt_mem, long loanamt_bank,
			long loanamt_invs, int term, String batchno, float int_rate, String grade, String subgrade, String jobtitle,
			int emp_len, String home_own, long income, String inc_status, String pay_plan, String loan_des,
			String purose, String loantitle, long zip, String addr_status, int dti, int delinq, int inq, int mon_delinq,
			int mon_pubrec, int open_cred, int der_pubrec, long rev_bal, long rev_util, long total_acc, String uni_stat,
			float total_rec_int, float total_late_fee, long recoveries, long collection, String appl_type, int last_week_pay, int acc_now_delinq,
			long total_coll_amnt, long total_cur_bal) {
		super();
		this.fname = fname;
		this.lname = lname;
		//this.dob = dob;
		this.phno = phno;
		this.eid = eid;
		this.add = add;
		this.fathern = fathern;
		this.mothern = mothern;
		this.aadhar = aadhar;
		this.accno = accno;
		this.pan = pan;
		this.memid = memid;
		this.loanamt_mem = loanamt_mem;
		this.loanamt_bank = loanamt_bank;
		this.loanamt_invs = loanamt_invs;
		this.term = term;
		this.batchno = batchno;
		this.int_rate = int_rate;
		this.grade = grade;
		this.subgrade = subgrade;
		this.jobtitle = jobtitle;
		this.emp_len = emp_len;
		this.home_own = home_own;
		this.income = income;
		this.inc_status = inc_status;
		this.pay_plan = pay_plan;
		this.loan_des = loan_des;
		this.purose = purose;
		this.loantitle = loantitle;
		this.zip = zip;
		this.addr_status = addr_status;
		this.dti = dti;
		this.delinq = delinq;
		this.inq = inq;
		this.mon_delinq = mon_delinq;
		this.mon_pubrec = mon_pubrec;
		this.open_cred = open_cred;
		this.der_pubrec = der_pubrec;
		this.rev_bal = rev_bal;
		this.rev_util = rev_util;
		this.total_acc = total_acc;
		this.uni_stat = uni_stat;
		this.total_rec_int = total_rec_int;
		this.total_late_fee = total_late_fee;
		this.recoveries = recoveries;
		this.collection = collection;
		/*this.collection_12_med = collection_12_med;
		this.worst_rating = worst_rating;*/
		this.appl_type = appl_type;
		//this.verif_joint = verif_joint;
		this.last_week_pay = last_week_pay;
		this.acc_now_delinq = acc_now_delinq;
		this.total_coll_amnt = total_coll_amnt;
		this.total_cur_bal = total_cur_bal;
		//this.total_rev_limit = total_rev_limit;
	}
	public userBL()
	{}
	
	
	String fname;
	String lname;
	String dob;
	String phno;
	String eid;
	String add;
	String fathern;
	String mothern;
    long aadhar;
	long accno;
	String pan;
    long memid;
	long loanamt_mem;
	long loanamt_bank;
	long loanamt_invs;
	int term;
	String batchno;
	float int_rate;
	String grade;
	String subgrade;
	String jobtitle;
	int emp_len;
	String home_own;
	long income;
	String inc_status;
	String pay_plan;
	String loan_des;
	String purose;
	String loantitle;
	long zip;
	String addr_status;
	int dti;
	int delinq;
	int inq;
	int mon_delinq;
	int mon_pubrec;
	int open_cred;
	int der_pubrec;
	long rev_bal;
	long rev_util;
	long total_acc;
	String uni_stat;
	float total_rec_int;
	float total_late_fee;
	long recoveries;
	long collection;
	//long collection_12_med;
	//int worst_rating;
	String appl_type;
	//String verif_joint;
	int last_week_pay;
	int acc_now_delinq;
	long total_coll_amnt;
	long total_cur_bal;
	//long total_rev_limit;
	//int loanstat;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getFathern() {
		return fathern;
	}
	public void setFathern(String fathern) {
		this.fathern = fathern;
	}
	public String getMothern() {
		return mothern;
	}
	public void setMothern(String mothern) {
		this.mothern = mothern;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public long getMemid() {
		return memid;
	}
	public void setMemid(long memid) {
		this.memid = memid;
	}
	public long getLoanamt_mem() {
		return loanamt_mem;
	}
	public void setLoanamt_mem(long loanamt_mem) {
		this.loanamt_mem = loanamt_mem;
	}
	public long getLoanamt_bank() {
		return loanamt_bank;
	}
	public void setLoanamt_bank(long loanamt_bank) {
		this.loanamt_bank = loanamt_bank;
	}
	public long getLoanamt_invs() {
		return loanamt_invs;
	}
	public void setLoanamt_invs(long loanamt_invs) {
		this.loanamt_invs = loanamt_invs;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public String getBatchno() {
		return batchno;
	}
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}
	public float getInt_rate() {
		return int_rate;
	}
	public void setInt_rate(float int_rate) {
		this.int_rate = int_rate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSubgrade() {
		return subgrade;
	}
	public void setSubgrade(String subgrade) {
		this.subgrade = subgrade;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public int getEmp_len() {
		return emp_len;
	}
	public void setEmp_len(int emp_len) {
		this.emp_len = emp_len;
	}
	public String getHome_own() {
		return home_own;
	}
	public void setHome_own(String home_own) {
		this.home_own = home_own;
	}
	public long getIncome() {
		return income;
	}
	public void setIncome(long income) {
		this.income = income;
	}
	public String getInc_status() {
		return inc_status;
	}
	public void setInc_status(String inc_status) {
		this.inc_status = inc_status;
	}
	public String getPay_plan() {
		return pay_plan;
	}
	public void setPay_plan(String pay_plan) {
		this.pay_plan = pay_plan;
	}
	public String getLoan_des() {
		return loan_des;
	}
	public void setLoan_des(String loan_des) {
		this.loan_des = loan_des;
	}
	public String getPurose() {
		return purose;
	}
	public void setPurose(String purose) {
		this.purose = purose;
	}
	public String getLoantitle() {
		return loantitle;
	}
	public void setLoantitle(String loantitle) {
		this.loantitle = loantitle;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getAddr_status() {
		return addr_status;
	}
	public void setAddr_status(String addr_status) {
		this.addr_status = addr_status;
	}
	public int getDelinq() {
		return delinq;
	}
	public void setDelinq(int delinq) {
		this.delinq = delinq;
	}
	public int getInq() {
		return inq;
	}
	public void setInq(int inq) {
		this.inq = inq;
	}
	public int getMon_delinq() {
		return mon_delinq;
	}
	public void setMon_delinq(int mon_delinq) {
		this.mon_delinq = mon_delinq;
	}
	public int getMon_pubrec() {
		return mon_pubrec;
	}
	public void setMon_pubrec(int mon_pubrec) {
		this.mon_pubrec = mon_pubrec;
	}
	public int getOpen_cred() {
		return open_cred;
	}
	public void setOpen_cred(int open_cred) {
		this.open_cred = open_cred;
	}
	public int getDer_pubrec() {
		return der_pubrec;
	}
	public void setDer_pubrec(int der_pubrec) {
		this.der_pubrec = der_pubrec;
	}
	public long getRev_bal() {
		return rev_bal;
	}
	public void setRev_bal(long rev_bal) {
		this.rev_bal = rev_bal;
	}
	public long getRev_util() {
		return rev_util;
	}
	public void setRev_util(long rev_util) {
		this.rev_util = rev_util;
	}
	public long getTotal_acc() {
		return total_acc;
	}
	public void setTotal_acc(long total_acc) {
		this.total_acc = total_acc;
	}
	public String getUni_stat() {
		return uni_stat;
	}
	public void setUni_stat(String uni_stat) {
		this.uni_stat = uni_stat;
	}
	public float getTotal_rec_int() {
		return total_rec_int;
	}
	public void setTotal_rec_int(float total_rec_int) {
		this.total_rec_int = total_rec_int;
	}
	public float getTotal_late_fee() {
		return total_late_fee;
	}
	public void setTotal_late_fee(float total_late_fee) {
		this.total_late_fee = total_late_fee;
	}
	public long getRecoveries() {
		return recoveries;
	}
	public void setRecoveries(long recoveries) {
		this.recoveries = recoveries;
	}
	public long getCollection() {
		return collection;
	}
	public void setCollection(long collection) {
		this.collection = collection;
	}
	/*public long getCollection_12_med() {
		return collection_12_med;
	}
	public void setCollection_12_med(long collection_12_med) {
		this.collection_12_med = collection_12_med;
	}
	public int getWorst_rating() {
		return worst_rating;
	}
	public void setWorst_rating(int worst_rating) {
		this.worst_rating = worst_rating;
	}*/
	public String getAppl_type() {
		return appl_type;
	}
	public void setAppl_type(String appl_type) {
		this.appl_type = appl_type;
	}
	/*public String getVerif_joint() {
		return verif_joint;
	}
	public void setVerif_joint(String verif_joint) {
		this.verif_joint = verif_joint;
	}*/
	public int getLast_week_pay() {
		return last_week_pay;
	}
	public void setLast_week_pay(int last_week_pay) {
		this.last_week_pay = last_week_pay;
	}
	public int getAcc_now_delinq() {
		return acc_now_delinq;
	}
	public void setAcc_now_delinq(int acc_now_delinq) {
		this.acc_now_delinq = acc_now_delinq;
	}
	public long getTotal_coll_amnt() {
		return total_coll_amnt;
	}
	public void setTotal_coll_amnt(long total_coll_amnt) {
		this.total_coll_amnt = total_coll_amnt;
	}
	public long getTotal_cur_bal() {
		return total_cur_bal;
	}
	public void setTotal_cur_bal(long total_cur_bal) {
		this.total_cur_bal = total_cur_bal;
	}
	/*public long getTotal_rev_limit() {
		return total_rev_limit;
	}
	public void setTotal_rev_limit(long total_rev_limit) {
		this.total_rev_limit = total_rev_limit;
	}*/
	public int getDti() {
		return dti;
	}
	public void setDti(int dti) {
		this.dti = dti;
	}
	
	
	/*boolean authenticate()
	{
		
		
		if(fname==null || lname==null || dob==null || phno==null || eid==null || add==null || fathern==null || mothern==null||aadhar==null||Long.toString(accno)==null|| pan==null||Long.toString(memid)==null ||Long.toString(loanamt_mem)==null||Long.toString(loanamt_bank)==null|| Long.toString(loanamt_invs)==null||
		   Integer.toString(term)==null||batchno==null||Float.toString(int_rate)==null|| grade==null || subgrade==null || jobtitle==null ||Integer.toString(emp_len)==null ||
			home_own== null ||Long.toString(income)== null || inc_status==null || pay_plan==null || loan_des==null || purose==null || loantitle==null ||
			Long.toString(zip)==null || addr_status==null || Integer.toString(dti)==null || Integer.toString(delinq)==null||Integer.toString(inq)==null|| Integer.toString(mon_delinq)==null|| Integer.toString(mon_pubrec)==null|| Integer.toString(open_cred)==null|| Integer.toString(der_pubrec)==null || Long.toString(rev_bal)==null|| Long.toString(rev_util)==null|| Long.toString(total_acc)==null ||
			uni_stat==null || Float.toString(total_rec_int)==null|| Float.toString(total_late_fee)==null|| Long.toString(recoveries)==null|| Long.toString(collection)==null|| Long.toString(collection_12_med)==null|| Integer.toString(worst_rating)==null|| appl_type==null|| verif_joint==null || Integer.toString(last_week_pay)==null || Integer.toString(acc_now_delinq)==null|| 
			Long.toString(total_coll_amnt)==null || Long.toString(total_cur_bal)==null || Long.toString(total_rev_limit)==null))
			return false;
		
		else 
			return true;
	}*/
	
			
	}
	
	


