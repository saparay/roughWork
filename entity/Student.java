package entity;

public class Student {
	private int studentId;
	private String studentName;
	private String emailId;
	private String branch;
	private int fee;
	
	public Student(int studentId, String studentName, String emailId, String branch, int fee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
		this.branch = branch;
		this.fee = fee;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", emailId=" + emailId + ", branch="
				+ branch + "]";
	}
	
	
	
}
