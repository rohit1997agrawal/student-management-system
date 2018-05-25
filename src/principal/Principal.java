

package principal;



import java.io.BufferedReader;
import java.io.InputStreamReader;

import modelclasses.Student;

public class Principal {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public void diplaystudent(Student st) throws Exception{
	{
	System.out.println("Name :  "+st.getName());
	System.out.println("Roll no : "+st.getRollno());
	System.out.println("Year : "+st.getYear());
	try{
	System.out.println("\nBranch code : "+st.getBranches().getcode()+"    Branch : "+st.getBranches().getBranchname());
	}catch(NullPointerException ex){
		System.out.println("Branch list not entered");
	}
	System.out.println("\n\nMarks  ");
	try{
	int size=st.marksList.size();
	for(int i=0;i<size;i++)
	{
	System.out.println("Subject name : " + st.marksList.get(i).getSubject() + "   Marks :  " + st.marksList.get(i).getMarks());
	}
	}catch(NullPointerException ex){
		System.out.println("Branch list not entered");
	}try{
	System.out.println("\n\nAttendace ");
	int size1=st.attendanceList.size();
	for(int i=0;i<size1;i++)
	{
	System.out.println("Date: " + st.attendanceList.get(i).getDate() + "    Status : " + st.attendanceList.get(i).getStatus());
	}
	}catch(NullPointerException ex){
		System.out.println("Attendancelist list not entered");
	}
}
}
}
