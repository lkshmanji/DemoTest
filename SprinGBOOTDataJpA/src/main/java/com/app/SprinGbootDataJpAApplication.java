package com.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.model.Student;
import com.app.service.StudentService;

@SpringBootApplication
public class SprinGbootDataJpAApplication {

	public static void main(String[] args) {

		ApplicationContext ap = SpringApplication.run(SprinGbootDataJpAApplication.class, args);

		StudentService ser = ap.getBean("ser", StudentService.class);

		/*
		 * Student s1 = new Student(0, "AAb", "India", "AA#LK", "934229893",
		 * "bhopal MP nagar"); Student s2 = new Student(0, "AAc", "usa", "AA#LK",
		 * "90569893", "bhopal MP nagar"); Student s3 = new Student(0, "AAd", "India",
		 * "AA#LK", "9005629893", "bhopal MP nagar"); Student s4 = new Student(0, "AAe",
		 * "UK", "AA#LK", "909876893", "bhopal MP nagar"); Student s5 = new Student(0,
		 * "AAf", "Sri lanka", "AA#LK", "90065229893", "bhopal MP nagar");
		 * ser.saveStudent(s1); ser.saveStudent(s2); ser.saveStudent(s3);
		 * ser.saveStudent(s4); ser.saveStudent(s5); System.out.println("Done");
		 */

		
		/*
		 * List <Student> list= ser.findAllStudents();
		 * 
		 * //Student sk=ser.findById(1); // System.out.println(sk);
		 * 
		 * // System.out.println(list);
		 * 
		 * for(Student s:list) {
		 * 
		 * System.out.println(s); }
		 */
		
		
		/*
		 * Student st= ser.findById(1); System.out.println(st);
		 */
		 
	Student st= new Student();
	st.setId(2);
	st.setName("Pawankumar");
	st.setCode("lakshman^&#A");
	st.setLocation("Losangelesh");
	st.setNationality("America");
	st.setMobnum("11111");
	
	ser.updateStudent(st);
	System.out.println("Updated succsefully");
		 
	}}


