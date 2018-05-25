package mainclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



import admin.Admin;
import faculty.Faculty;
import session.Datasession;



import modelclasses.Student;

import principal.Principal;


public class Mainclass {

	public static void main(String[] args) throws IOException {
		
	
	



	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
boolean g=true;
	
	while(g)
	{
	
	System.out.println("Choose user ");
	System.out.println("1: Admin" );
	System.out.println("2.Faculty");
	System.out.println("3.Principal");
	System.out.println("Enter option : ");
	int z=Integer.parseInt(br.readLine());
	
	
	
	switch(z)
	{
	case 1:
		Admin admin=new Admin();
		System.out.println("1. To Add a Branch ");
		System.out.println("2. To add a Student ");
		System.out.println("3. To add a Subject ");
		System.out.println("Enter option : ");
		
		
		int y=Integer.parseInt(br.readLine());
		if(y==1)
		{	
			boolean r=true;
			
			while(r)
		{
			admin.addBranch();
			System.out.println("type TRUE to to add Branch or FALSE to go to main menu ");
			r=Boolean.parseBoolean(br.readLine());
			}
		}
		else if (y==2)
		{
			boolean x=true;
			
			while(x)
		{
				admin.addSttudent();

			System.out.println("type TRUE to add a new Student or FALSE to go to main menu ");
			x=Boolean.parseBoolean(br.readLine());
			
			}
		}
		else if(y==3)
		{ 	
			boolean e=true;
			
			while(e)
		{
				admin.addSubjects();
			
			System.out.println("type TRUE to add a subject or FALSE to go to main menu ");
			
			e=Boolean.parseBoolean(br.readLine());
			
			
			}
			
			
		}
		break;
		
	case 2:
		
		System.out.println("1.To  Enter Marks - ");
		System.out.println("2.To Enter Attendance - ");
		System.out.println("Enter option : ");
		int q = Integer.parseInt(br.readLine());
		Faculty faculty= new Faculty();
		if(q==1)
			
		{boolean v=true;
		
		while(v)
	{
			
		
			System.out.print("Enter register number : ");
			int r = Integer.parseInt(br.readLine());
			Student St=Datasession.studentMap.get(r);
			boolean j=true;
			
			while(j)
		{
				faculty.addmarks(St);
//			Marks marks = new Marks ();
//			System.out.println("Enter the subject name :  ");
//			marks.setSubject(br.readLine());
//			System.out.println("Enter the marks : ");
//			marks.setMarks(Integer.parseInt(br.readLine()));
//			St.marksList.add(marks);
			
			
			System.out.println("type TRUE to add marks for another subject or FALSE to select another student ");
			
			j=Boolean.parseBoolean(br.readLine());
			
			
			}
System.out.println("type TRUE to add marks for another student or FALSE to go to main menu ");
			
			v=Boolean.parseBoolean(br.readLine());
			
			
			}
			
		}
		else if(q==2)
		{boolean p=true;
		
		while(p)
	{
			
			System.out.print("Enter register number : ");
			int w = Integer.parseInt(br.readLine());
			Student St=Datasession.studentMap.get(w);
	
			boolean h=true;
			
			while(h)
		{
			 
			   faculty.addattendance(St); 
			
			System.out.println("type TRUE to add anoter attendace for same student or FALSE to select another student ");
			
			h=Boolean.parseBoolean(br.readLine());
			}
			
			System.out.println("type TRUE to add attendace for another student or FALSE to go to main menu ");
			
			p=Boolean.parseBoolean(br.readLine());
			
			
			}
		}
		break;
	case 3:
		System.out.println("enter registration number of student to view details : ");
		int r = Integer.parseInt(br.readLine());
		Student st=Datasession.studentMap.get(r);
		if(st==null){
			System.out.println("No student Found");
		}else{
        Principal principal=new Principal();
		
			try {
				principal.diplaystudent(st);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Some Error Occuerd run Again");
			}
		
	}
	}
	
	System.out.println("type TRUE to go to main menu  or FALSE to end application ");
	
	g=Boolean.parseBoolean(br.readLine());
	
	
	}
	
	

	}

}
