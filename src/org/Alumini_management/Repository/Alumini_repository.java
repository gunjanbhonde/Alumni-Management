package org.Alumini_management.Repository;
import java.util.*;

import org.Alumini_management.Model.Alumini;
public class Alumini_repository {
     static ArrayList al= new ArrayList ();  // temporary database for stored student alumini data.
     
     
    
     
     public int getPRN() {
       	 
     	return al.size();
     }
    public boolean isAluminiadd(Alumini a)	{
    	boolean b=al.add(a);
    	return b;
    }	
    
    		 
    		 
    		 
    		 
    		 
	public ArrayList getAllAluminies() {
		return al;
	}
			 
    		 
    		 
    		 
    		 
    		 
    		 
    		 
    		 
	
	
	
	
	
	
	
	
}
