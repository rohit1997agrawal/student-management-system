
package modelclasses;


import java.util.ArrayList;

public class Student {
	private String name;
	private int rollno;
	private Attendace attendace;
	private Marks marks;
	private Subject subject;
	private Branches branches;  
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public ArrayList<Marks> marksList=new ArrayList<Marks>();
	public ArrayList<Attendace> attendanceList=new ArrayList<Attendace>();
	
	
	
	public Student() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Attendace getAttendace() {
		return attendace;
	}
	public void setAttendace(Attendace attendace) {
		this.attendace = attendace;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Branches getBranches() {
		return branches;
	}
	public void setBranches(Branches branches) {
		this.branches = branches;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	

}
