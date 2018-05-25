package admin;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import modelclasses.Branches;
import modelclasses.Student;
import modelclasses.Subject;
import session.Datasession;

public class Admin {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public void addSttudent() throws IOException{
	Student student = new Student();
	System.out.println("Enter Student name :  ");
	student.setName(br.readLine());
	System.out.println("Enter roll no : ");
	student.setRollno(Integer.parseInt(br.readLine()));
	System.out.println("Enter register no : ");
	int a=Integer.parseInt(br.readLine());
	System.out.println("Enter year :  ");
	student.setYear(Integer.parseInt(br.readLine()));
	try{
	System.out.println("Enter branch code :  ");
	int q = Integer.parseInt(br.readLine());
	Branches Br=Datasession.branchList.get(q);
	student.setBranches(Br);
	}catch(NumberFormatException e){
		System.out.println("Enter branch code as a Number .Try Again");
		addSttudent();
	}
	Datasession.studentMap.put(a, student);
}
public void addSubjects() throws IOException{
	Subject subject = new Subject();
	try{
	System.out.println("Enter branch code  : (Number Expected)");
	subject.setBranch(Integer.parseInt(br.readLine()));
	}catch(NumberFormatException e){
		System.out.println("Enter branch code as a Number .Try Again");
		addSubjects();
	}
	System.out.println("Enter Subject name : ");
	subject.setName(br.readLine());
	System.out.println("Enter total marks : ");
	subject.setTotalmarks(Integer.parseInt(br.readLine()));
	Datasession.subjectSet.add(subject);
}
public void addBranch() throws IOException{
	Branches branch = new Branches();
	System.out.println("Enter branch name : ");
	branch.setBranchname(br.readLine());
	try{
	System.out.println("Enter branch code : (Number expected)");
	int x=Integer.parseInt(br.readLine());
	branch.setcode(x);
	Datasession.branchList.put(x,branch);
	}catch(NumberFormatException e){
		System.out.println("Enter branch code as a Number .Try Again");
		addBranch();
	}
	

	
}
}
