package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
@Service("ser")
public class Studentservice {
	public void Formattribut(Model model)
	{
		
	List<String> gender=new ArrayList<String>()	;
	gender.add("M");
	gender.add("F");
	model.addAttribute("gender", gender);
	
	
	List<String> course=new ArrayList<String>()	;
	
	course.add("J2SE");
	course.add("J2EE");
	course.add("hIBERNATE");
	course.add("SPRING");
	course.add("SPRING BOOT");
	model.addAttribute("course", course);
	
	
	
	List<String> timing=new ArrayList<String>()	;
	timing.add("Morning 9AM");
	timing.add("OFTERNOON 2PM");
	timing.add("EVNING 7PM");
	model.addAttribute("timing", timing);
	
		
	}
	

}
