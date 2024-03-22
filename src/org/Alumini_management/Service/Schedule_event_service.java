package org.Alumini_management.Service;
import java.util.ArrayList;
import java.util.*;

import org.Alumini_management.Model.Alumini;
import org.Alumini_management.Model.Schedule_event;
import org.Alumini_management.Repository.*;
public class Schedule_event_service {
  Scanner xyz=new Scanner(System.in);
  ArrayList<Schedule_event>Sl1;
	Schedule_event S;
	Schedule_event_repository Sc_event= new Schedule_event_repository ();
	
	Alumini a;
	ArrayList<Alumini>al1;
	Alumini_repository Alumini_repo = new Alumini_repository();
	
	
	public boolean isADDEvents(Schedule_event sc_event) {
		boolean s1=Sc_event.isEventAdd(sc_event);
		return s1;
	}
	
	
	
	
	public ArrayList getALLEvents() {
		ArrayList Schedule_list= Sc_event.getAllEvents();
		return Schedule_list.size()>0?Schedule_list:null;
	}
 
	  
	//*******************************code for Add new Event in College Start*****************************************//
	
	 public void Adding_event(){
		System.err.println("1:Add new Event in College");
	System.out.println("Enter the Event name:");
	String  Schedule_name = xyz.nextLine();
	System.out.println("Enter the Event Date:");
	String Schedule_time = xyz.nextLine();
	 
//	boolean Present=false;
	S = new Schedule_event(Schedule_name,Schedule_time);
    
	boolean s1 =Sc_event.isEventAdd(S);


	if (s1)
	{
		System.out.println("Event added Successfully...");
		Sl1=Sc_event.getAllEvents();
		if (Sl1 != null)
		{
			for (Object obj : Sl1)   
			{
				Schedule_event b2 = (Schedule_event) obj;
			    System.out.println("====================================================");
				System.out.println(" Event name:" +b2.getSchedule_name());
				System.out.println(" Event Date:" + b2.getSchedule_time());
				System.out.println("====================================================");
				System.out.println("--------------------------------------------------");
			}
		} 
		else{
			System.out.println("No Events are present...");
		     } 
	} else 
	{
		System.out.println("Error...");
		System.out.println("--------------------------------------------------");
	}
	
	

}
		//*******************************code for Add new Event in College end*****************************************//	
	  

	  
	//*******************************code for Modify Event by name Start*****************************************//
	 
 	
 	      public void Modify_Event_by_name() {     
 	        System.err.println("6:Modife Event by name:");
	    	System.err.println("Enter the Event name to modify details");
	    	String getmodify_event=xyz.next();
	    	boolean flag=false;
//	    	ArrayList S_e3=Schedule.getALLEvents();
	    	Sl1=Sc_event.getAllEvents();
	    	//ArrayList al2=Alu_service.getAllAluminies();
	    	ArrayList<Schedule_event>s4 = new ArrayList<Schedule_event>(Sl1);
			//ArrayList<Alumini>al3 = new ArrayList<Alumini>(al2);
			for (int i = 0; i < s4.size(); i++) 
			{
				
			    	if(s4.get(i).getSchedule_name().equals(getmodify_event)) 
					{    flag=true;
			    		xyz.nextLine();
			    		System.out.println("Enter the Event name:");
				    	String  modify_Schedule_name = xyz.nextLine();
						System.out.println("Enter the Event Date:");
						String modify_Schedule_time = xyz.nextLine();
						
                    s4.get(i).setSchedule_name(modify_Schedule_name);
                    s4.get(i).setSchedule_time(modify_Schedule_time);
					}
			    	
			 }	
			if(flag==false) 
			{
				System.err.println("Invalid Event Name");
	    		System.err.println("====================================================");
			}
		}	
		//*******************************code for Modify Event by name end*****************************************//	
	  

	//*******************************code for Mark Attendance Alumini Start*****************************************//
 	                   

 				    	 public void Mark_Attendance(){      
 				    		
 				    		 System.err.println("Enter the PRN of Alumini to Mark Attendance ");
 						    	int getPRN=xyz.nextInt();
 						    	boolean flag=false;
 						    	boolean flag_1=false;
 						    	boolean flag_2=false;
 	                             String yes_mark="yes";
 	                             String no_mark="no";
 	
 						    //	ArrayList al2=Alu_service.getAllAluminies();
 						    	al1=Alumini_repo.getAllAluminies();
 								ArrayList<Alumini>al3 = new ArrayList<Alumini>(al1);
 								for (int i = 0; i < al3.size(); i++) 
 								{
 									
 									   if (al3.get(i).getPRN()==getPRN) 
 										{
 										   flag=true;
// 										  System.err.println(" All Events shown below");
 										   Sl1=Sc_event.getAllEvents();
 										   if (Sl1 != null)
 										     {
// 											    for (Object obj : Sl1)   
 											   // {
// 		      									Schedule_event b2 = (Schedule_event) obj;
// 											    System.out.println("====================================================");
// 												System.out.println(" Event name:" +b2.getSchedule_name());
// 												System.out.println(" Event Date:" + b2.getSchedule_time());
// 												System.out.println("====================================================");
// 												System.out.println("--------------------------------------------------");
 												  
 												xyz.nextLine();
 												System.err.println("Enter 'yes' for mark Attendance:");
 										    	System.err.println("Enter 'no' for Exit:");
 										    	String Attendance=xyz.next();    
 										    	  if(Attendance.equals(yes_mark))
 											    	  {
 											    		  al3.get(i).setPresent(true);
 											    		  flag_2=true;
 											    		  break;
 											    	  }
 											    	else
 											    	{
 											    		 flag_1=true;
 											    	}   
 											    //}
 										     } 
 										 else{
 											     System.out.println("No Events are present...");
 										     } 
 										  
 										  
 										  
 										  
 										}
// 									   else {
// 										  flag_1=true;
// 									   }
 									  if(flag==false & flag_1==false) 
 	 									{
 	 										System.err.println("Invalid PRN");
 	 							    		System.err.println("====================================================");
 	 									}
 										    
 										
 	
 								 }	
 								
 	
 						}	
 				    	 
 				    	 
 				    	 
 				    	 
 				    	 
 				    	 
 				    	 
 				    	 
 				    	 
 				    	 
// 				    	 
// 				    	 
// 				    	 
// 				    	System.err.println("Enter the PRN of Alumini to Mark Attendance ");
//					    	int getPRN=xyz.nextInt();
//					    	boolean flag=false;
//					    	boolean flag_1=false;				    	
//                          String yes_mark="yes";
//                          String no_mark="no";
//
//					    //	ArrayList al2=Alu_service.getAllAluminies();
//					    	al1=Alumini_repo.getAllAluminies();
//							ArrayList<Alumini>al3 = new ArrayList<Alumini>(al1);
//							for (int i = 0; i < al3.size(); i++) 
//							{
//								
//								   if (al3.get(i).getPRN()==getPRN) 
//									{
//									    System.err.println("2:Display all Events");
//										ArrayList S_ee=Schedule.getALLEvents();
////										System.out.println(S_e.size());
//										if (S_e != null)
//										{
//											for (Object obj : S_ee) 
//											{
//												Schedule_event ss = (Schedule_event) obj;
//											    System.out.println("====================================================");
//												System.out.println("Event name:" +ss.getSchedule_name());
//												System.out.println("Event date:" + ss.getSchedule_time());
//												System.out.println("====================================================");
//											}
//											
//											
//											System.err.println("Enter 'yes' for mark Attendance:");
//									    	System.err.println("Enter 'no' for Exit:");
//									    	String Attendance=xyz.next();
//									    	if(Attendance.equals(yes_mark))
//									    	  {
//									    		  al3.get(i).setPresent(true);
//									    		  flag=true;
//									    		  break;
//									    	  }
//									    	else
//									    	{
//									    		 flag_1=true;
//									    	}
//											
//											
//											
//					
//											
//										} 
//										else {
//											System.out.println("No Events are present...");
//										     } 	
//									    
//								    	
//								    	
//								    }
//
//							 }	
//							if(flag==false & flag_1==false) 
//							{
//								System.err.println("Invalid PRN");
//					    		System.err.println("====================================================");
//							}

		//*******************************code for Mark Attendance Alumini end*****************************************//	
	  
	  	
	
	
	
}
