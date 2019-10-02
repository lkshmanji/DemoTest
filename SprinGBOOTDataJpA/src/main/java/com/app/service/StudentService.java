package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentService {

	public Student findById(int id);

	public void saveStudent(Student st);

	public void updateStudent(Student st);

	public void deletById(int id);

	public void deleteStudentByCode(String code);

	public List<Student> findAllStudents();

	public Student findStudentByCode(String code);

	public Student findStudentByMobNum(String mobnum);

}
