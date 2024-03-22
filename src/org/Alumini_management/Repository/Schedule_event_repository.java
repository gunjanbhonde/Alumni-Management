package org.Alumini_management.Repository;
import java.util.*;

import org.Alumini_management.Model.Alumini;
import org.Alumini_management.Model.Schedule_event;

public class Schedule_event_repository 
{
ArrayList Schedule_list =new ArrayList();

	
	
public boolean isEventAdd(Schedule_event S)	{
	boolean s=Schedule_list.add(S);
	return s;
}	





public ArrayList getAllEvents() {
	return Schedule_list;
}	
	
	
	
}










	 
    		 
    		 
 