package org.Alumini_management.Client;
import org.Alumini_management.Model.*;
import org.Alumini_management.Service.*;
import org.Alumini_management.Repository.*;
import java.util.*;
public class Alumini_manag_client_app 

{

	public static void main(String[] args) {
	 
		Alumini_service Alu_service =new Alumini_service();
		Alumini a=new Alumini();
		ArrayList <Alumini>al;
		Schedule_event_service Schedule=new Schedule_event_service();
		Schedule_event S=new Schedule_event();
		
		
		int choice;
     do
     {      System.err.println("====================================================");
    	    System.out.println("Welcome to Alumini Management application.");
			System.out.println("1:Add new Alumini");
			System.out.println("2:Display all Alumini");
			System.out.println("3:Search Alumini by PRN");
			System.out.println("4:Update Alumini info by PRN");
			System.out.println("5:Add Event in College");
			System.out.println("6:Modife Event by name:");
	       System.out.println("7:Mark Attendance");
	       System.out.println("8:Dispaly Absent Alumini on Event");
	       System.out.println("9:Display Alumini Branch wise");
	       System.out.println("10:Delete Alumini by PRN");
	       System.out.println("11:Exit");
	       System.out.println("Enter the choice");
			System.out.println("--------------------------------------------------");
			Scanner xyz = new Scanner(System.in);
			choice = xyz.nextInt();
			switch (choice) 
			{

			    case 1:
			    	 Alu_service.newADDAlumini();
				break;

			    case 2:
			    	 Alu_service.Dispaly_Alumini();   	
				break;
				
			    case 3:
			    	 Alu_service.Search_Alumini();

			    break;	

			    case 4:
			    	 Alu_service.Modify_Alumini_Details();

				break;	

			    case 5:
			    	Schedule.Adding_event();
				break;	

			    case 6:
			    	Schedule.Modify_Event_by_name();
				break;	

			    case 7:
			    	Schedule.Mark_Attendance();   
				break;	

			    case 8:
			    	 Alu_service.Dispaly_Absent_Alumini_on_Event();
				break;	

			    case 9:
			    	 Alu_service.Display_Alumini_Branch_wise();
			    break;	

			    case 10:
			    	 Alu_service.Delete_Alumini_by_PRN();
				break;	
				
			    case 11:
			    	System.err.println("Thanks for visit Application");
			    break;	
				
				
			    default:
				System.out.println("Wrong choice");
				
			} 
	 } while (choice<=10);

	}

	

}
