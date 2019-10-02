package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.StudentDao;
import com.app.model.Student;

@Service("ser")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao dao;

	@Override
	public Student findById(int id) {

		return dao.getOne(id);
	}

	@Override
	public void saveStudent(Student st) {
		dao.save(st);

	}

	@Override
	public void updateStudent(Student st) {
		dao.save(st);

	}

	@Override
	public void deletById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void deleteStudentByCode(String code) {
		dao.deleteById(code);

	}

	@Override
	public List<Student> findAllStudents() {

		return dao.findAll();
	}

	@Override
	public Student findStudentByCode(String code) {

		return dao.getOne(code);
	}

	@Override
	public Student findStudentByMobNum(String mobnum) {

		return dao.getOne(mobnum);
	}

}