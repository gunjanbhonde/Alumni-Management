package org.Alumini_management.Service;
import java.util.ArrayList;
import java.util.*;
import org.Alumini_management.Model.Alumini;
import org.Alumini_management.Model.Schedule_event;
import org.Alumini_management.Repository.Alumini_repository;
public class Alumini_service {

Scanner xyz=new Scanner(System.in);

Alumini a;
ArrayList<Alumini>al1;
Alumini_repository Alumini_repo = new Alumini_repository();
//Schedule_event_service Schedule=new Schedule_event_service();
//Schedule_event S=new Schedule_event();
    
	

//	Alumini a;
	
	
//*******************************code for Adding new Alumini Start*****************************************//	
	
	public void newADDAlumini() {
		  System.err.println("1:Add new Alumini");
	  	System.out.println("Enter the Alumini name:");
	  	String Name = xyz.nextLine();
			System.out.println("Enter the Alumini Email:");
			String Email = xyz.nextLine();
			System.out.println("Enter the Mobile no:");
			String Mobile_no = xyz.nextLine();
			System.out.println("Enter the Alumini Branch");
			String Branch =xyz.nextLine(); 
			System.out.println("Enter the Alumini Batch year wise");
			String Batch =xyz.nextLine(); 
			boolean Present=false;

			a = new Alumini(Name,Email,Mobile_no,Branch,Batch,Present);
		    
			int Alu_PRN=Alumini_repo.getPRN();
			Alu_PRN+=1;
			a.setPRN(Alu_PRN);

			boolean b1 = Alumini_repo.isAluminiadd(a);

			if (b1)
			{
				System.out.println("Alumini added Successfully...");
				System.out.println("--------------------------------------------------");
			} else 
			{
				System.out.println("Error...");
				System.out.println("--------------------------------------------------");
			}

		}
	
//*******************************code for Adding new Alumini end*****************************************//		
	
	
//	public boolean isADDAlumini(Alumini alumini) {
//		a=alumini;
		
//        boolean b= Alumini_repo.isAluminiadd(alumini);
//        return b;
//	} 
	   
	
	  public ArrayList getAllAluminies() 
	    {
			ArrayList al=Alumini_repo.getAllAluminies();
			return al.size()>0?al:null;
		}
	//*******************************code for Dispaly Alumini  start*****************************************//
	  
	  
	  public void Dispaly_Alumini() 
	  {
  	System.err.println("2:Display all Alumini");
	al1=Alumini_repo.getAllAluminies();
	if (al1 != null)
	{
		for (Object obj : al1)   
		{
		    Alumini b2 = (Alumini) obj;
		    System.out.println("====================================================");
			System.out.println("Alumini PRN:" +b2.getPRN());
			System.out.println("Alumini Name:" + b2.getName());
			System.out.println("Alumini Email:" + b2.getEmail());
			System.out.println("Alumini Mobile no:" + b2.getMobile_no());
			System.out.println("Alumini Branch:" + b2.getBranch());
			System.out.println("Alumini Batch:" + b2.getBatch());
			System.out.println("Alumini Present:" + b2.isPresent());
			System.out.println("====================================================");
		}
	} 
	else{
		System.out.println("No Aluminies are present...");
	     } 	
	
	  }
	
		//*******************************code for Dispaly Alumini end*****************************************//	
	
	
	
	//*******************************code for Search Alumini Start*****************************************//
	  
	  public void Search_Alumini(){      
	    	System.err.println("Enter the PRN of Alumini to search");
	    	int getPRN=xyz.nextInt();
	    	boolean flag=false;

//	    	ArrayList al1=Alu_service.getAllAluminies();
	    	al1=Alumini_repo.getAllAluminies();
			ArrayList<Alumini>al2 = new ArrayList<Alumini>(al1);
			for (int i = 0; i < al2.size(); i++) 
			{
				  if (al2.get(i).getPRN()==getPRN) 
					{     flag=true;
			    		System.out.println("Alumini PRN:" +al2.get(i).getPRN());
			    		System.out.println("Alumini Name:" +al2.get(i).getName());
			    		System.out.println("Alumini Email:" +al2.get(i).getEmail());
			    		System.out.println("Alumini Mobile no:" +al2.get(i).getMobile_no());
			    		System.out.println("Alumini Branch:" +al2.get(i).getBranch());
			    		System.out.println("Alumini Batch:" +al2.get(i).getBatch());	
			    		System.out.println("====================================================");
					}

					
			 }
			if(flag==false) 
			{
				System.err.println("Invalid PRN");
	    		System.err.println("====================================================");
			}

			
		 }
		//*******************************code for Search Alumini end*****************************************//	
	  
	  
	  
	//*******************************code for modify Alumini details Start*****************************************//
	  
	        public void Modify_Alumini_Details(){      
	    	System.err.println("Enter the PRN of Alumini to modify details");
	    	int getPRN=xyz.nextInt();
	    	boolean flag=false;
//	    	ArrayList al2=Alu_service.getAllAluminies();
	    	al1=Alumini_repo.getAllAluminies();
			ArrayList<Alumini>al3 = new ArrayList<Alumini>(al1);
			for (int i = 0; i < al3.size(); i++) 
			{
				
			    	if (al3.get(i).getPRN()==getPRN) 
					{    flag=true;
			    		xyz.nextLine();
				    	System.out.println("Enter the Alumini name:");
				    	String modify_Name = xyz.nextLine();
						System.out.println("Enter the Alumini Email:");
						String modify_Email = xyz.nextLine();
						System.out.println("Enter the Mobile no:");
						String modify_Mobile_no = xyz.nextLine();
						System.out.println("Enter the Alumini Branch");
						String modify_Branch =xyz.nextLine(); 
						System.out.println("Enter the Alumini Batch year wise");
						String modify_Batch =xyz.nextLine(); 
						
						al3.get(i).setName(modify_Name);
						al3.get(i).setEmail(modify_Email);
						al3.get(i).setMobile_no(modify_Mobile_no);
						al3.get(i).setBranch(modify_Branch);
						al3.get(i).setBatch(modify_Batch);	
                     // al3.get(i).setPresent(false);
					}
			    	
			 }	
			if(flag==false) 
			{
				System.err.println("Invalid PRN");
	    		System.err.println("====================================================");
			}
		}	
		//*******************************code for modify Alumini details end*****************************************//	
	  
	  
	  
	  
	  
	//*******************************code for Dispaly Absent Alumini on Event Start*****************************************//
	        public void Dispaly_Absent_Alumini_on_Event() {      
	    		 System.err.println("Dispaly Absent Alumini on Event");
                   int count=0;
                   al1=Alumini_repo.getAllAluminies();
			    	
					ArrayList<Alumini>al3 = new ArrayList<Alumini>(al1);
					for (int i = 0; i < al3.size(); i++) 
					{
						
					    	if (al3.get(i).isPresent()==false) 
							{
					    	   
						    	System.err.println(al3.get(i).getName());
						    	count++;
						    }
					 
					 }	
					 System.out.println("Total Aluminies in College:"+al3.size());
					 System.err.println("----------------------------------------------------");
					 System.out.println("Total absent Aluminies:"+count);
					 System.err.println("====================================================");
			}	
	    	 

		//*******************************code for Dispaly Absent Alumini on Event end*****************************************//	
	  
	  
	  

	 //*******************************code for Display Alumini Branch wiseStart*****************************************//
	        public void Display_Alumini_Branch_wise() {
				System.err.println("9:Display Alumini Branch wise");
		    	int electrical=0;
		    	int mechanical=0;
		    	int civil=0;
		    	int computer=0;
		    	String get_electrical="electrical";
		    	String get_mechanical="mechanical";
		    	String get_civil="civil";
		    	String get_computer="computer";
		    	
		    	al1=Alumini_repo.getAllAluminies();
				if (al1 != null)
				{
					for (Object obj : al1) 
					{
						Alumini b2 = (Alumini) obj;

						if (b2.getBranch().equals(get_electrical))
						{
							electrical++;
						} 
						else if (b2.getBranch().equals(get_mechanical)) 
						{   mechanical++;
							
						} else if (b2.getBranch().equals(get_civil))
						{
							civil++;
						} else if (b2.getBranch().equals(get_computer))
						{
							computer++;
						}
		           }
		        
					System.out.println("Electrical branch:"+electrical);
					System.out.println("Mechanical branch:"+mechanical);
					System.out.println("Civil branch:"+civil);
					System.out.println("Computer branch:"+computer);
				}
			}
	  
	  //*******************************code for Display Alumini Branch wise end*****************************************//	
	    	  
	    	  
	  
	  
	  
	//*******************************code for Delete Alumini Start*****************************************//
	    	public void Delete_Alumini_by_PRN(){   
	    		System.out.println("10:Delete Alumini by PRN");
	     	System.out.println("Enter the PRN to delete the Alumini");
    	    int getPRN=xyz.nextInt();
    	    boolean flag=false;
    	    al1=Alumini_repo.getAllAluminies();
	    	ArrayList<Alumini>al3 = new ArrayList<Alumini>(al1);
			for (int i = 0; i < al3.size(); i++) 
			{
				
			    	if (al3.get(i).getPRN()==getPRN) 
					{   flag=true;
			    		al1.remove(i);
					}
	        } 
			if(flag==false) 
			{
				System.err.println("Invalid PRN");
	    		System.err.println("====================================================");
			}
			if(flag==true) {
				System.err.println("Alumini Delete Successfully!");
			}
			if(al1.size()==0){
				System.out.println("No Aluminies are present...");
			     } 	
			
			
	     }
		//*******************************code for Delete Alumini end*****************************************//	

			
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
  
	  
	  
	  

	
	
}
