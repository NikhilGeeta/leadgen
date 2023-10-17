package com.StudentsLeadsDevelopment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentsLeadsDevelopment.Entity.StudentsEntity;
import com.StudentsLeadsDevelopment.Repo.StudentRepository;
import com.StudentsLeadsDevelopment.dto.Studentdto;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo ;
	
	@Override
	public void SaveLeads(StudentsEntity stu) {
		studentRepo.save(stu);
	}

	@Override
	public List<StudentsEntity> listAllLeads() {
		List<StudentsEntity> all = studentRepo.findAll();
		return all;
	}

	@Override
	public void Delete(Long id) {
		studentRepo.deleteById(id);
	}

	@Override
	public StudentsEntity findByID(long id) {
		Optional<StudentsEntity> byId = studentRepo.findById(id);
		return byId.get();
	}

	@Override
	public void saveUpdate(Studentdto dto) {
		StudentsEntity stu = new StudentsEntity();
		stu.setId(dto.getId());
		stu.setFirstName(dto.getFirstName());
		stu.setLastName(dto.getLastName());
		stu.setEmail(dto.getEmail());
		stu.setPhone(dto.getPhone());
		studentRepo.save(stu);
	}

}
