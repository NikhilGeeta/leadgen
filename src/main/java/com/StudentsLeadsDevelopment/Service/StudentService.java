package com.StudentsLeadsDevelopment.Service;

import java.util.List;

import com.StudentsLeadsDevelopment.Entity.StudentsEntity;
import com.StudentsLeadsDevelopment.dto.Studentdto;

public interface StudentService {
	public void SaveLeads(StudentsEntity stu);

	public List<StudentsEntity> listAllLeads();
	
	public void Delete(Long id);

	public StudentsEntity findByID(long id);

	public void saveUpdate(Studentdto dto);
}
