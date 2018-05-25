package faculty;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import modelclasses.Attendace;
import modelclasses.Marks;
import modelclasses.Student;
import modelclasses.Subject;
import session.Datasession;

public class Faculty {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void addmarks(Student st) throws NumberFormatException, IOException{
		
		Iterator<Subject> it = Datasession.subjectSet.iterator();
		System.out.println("Enter the Marks for the Student");
	     while(it.hasNext()){
	    	 Subject subject=it.next();
	    	 if(subject.getBranch()==st.getBranches().getcode()){
	    	 System.out.println(""+subject.getName()+" : ");
	    	 try{
	    	Marks marks = new Marks ();
	    	 marks.setMarks(Integer.parseInt(br.readLine()));
	    	 marks.setSubject(subject.getName());
	    	 st.marksList.add(marks);
	    	 }catch(NumberFormatException e){
	    		 System.out.println("Enter Mark as a Number .Try Again");
	    		 addmarks(st);
	    	 }
	    	 
	    	 }
	     }
	     
	}
    public void addattendance(Student st) throws IOException{
    	Attendace attendace = new Attendace();
	    System.out.println("Enter the date : ");
	    
	    attendace.setDate(br.readLine());
	    try{
	    System.out.println("Enter status 1 for present - 0 for absent :  ");
	    attendace.setStatus(Integer.parseInt(br.readLine()));
	    }catch(NumberFormatException e){
   		 System.out.println("Enter 0/1 .Try Again");
   		addattendance(st);
   	 }

	st.attendanceList.add(attendace);
    }
}
