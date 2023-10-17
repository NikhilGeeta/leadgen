package com.StudentsLeadsDevelopment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentsLeadsDevelopment.Entity.StudentsEntity;

public interface StudentRepository extends JpaRepository<StudentsEntity,Long>{

}
