package org.Alumini_management.Model;

public class Alumini {
	private int PRN;
	private String Name;
	private String Email;
	private String Mobile_no;
	private String Branch;
	private String Batch;
	private boolean Present;
	
	

	public int getPRN() {
		return PRN;
	}

	public void setPRN(int PRN) {
		this.PRN = PRN;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile_no() {
		return Mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		Mobile_no = mobile_no;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getBatch() {
		return Batch;
	}

	public void setBatch(String batch) {
		Batch = batch;
	}

	public boolean isPresent() {
		return Present;
	}

	public void setPresent(boolean present) {
		Present = present;
	}

	public Alumini() {
	
	}

    public Alumini(String Name,String Email,String Mobile_no,String Branch,String Batch,boolean Present) {
//		this.PRN=PRN;
    	this.Name = Name;
		this.Email = Email;
		this.Mobile_no = Mobile_no;
		this.Branch = Branch;
		this.Batch=Batch;
		this.Present=Present;
    }
	
	


	

	

}
