package org.Alumini_management.Model;

public class Schedule_event {
    private String Schedule_name;
    private String Schedule_time;
    
    
    
    
	public String getSchedule_name() {
		return Schedule_name;
	}
	public void setSchedule_name(String schedule_name) {
		Schedule_name = schedule_name;
	}
	public String getSchedule_time() {
		return Schedule_time;
	}
	public void setSchedule_time(String schedule_time) {
		Schedule_time = schedule_time;
	}
    
	
	
	
	public Schedule_event(){
		
	}
	
     public Schedule_event(String Schedule_name, String Schedule_time){
		 this.Schedule_name=Schedule_name;
		 this.Schedule_time=Schedule_time;
	}
	
	
	
	
	
	
	
	
	
    
}
