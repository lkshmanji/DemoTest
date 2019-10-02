package com.app.controller;

import javax.xml.ws.Service.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.bean.Student;
import com.app.service.Studentservice;

@Controller
public class StudentController {

	public StudentController() {
		System.out.println("Default cfontroller");
	}

	@Autowired(required = true)
	private Studentservice ser;

	@RequestMapping(value = "/fc", method = RequestMethod.GET)
	public String studentRegForm(Model model) {
		Student s = new Student();
		model.addAttribute("s", s);
		ser.Formattribut(model);
		return "StudentReg";
	}

	@RequestMapping(value = "/save.htm", method = RequestMethod.POST)
	public String studentresults(@ModelAttribute("s") Student st, Model model) {

		model.addAttribute("s", st);
		ser.Formattribut(model);
		// ser.savestudent(st);
		// model.addAttribute("s", "Record inserted succsefully");

		return "succse";
	}

}
