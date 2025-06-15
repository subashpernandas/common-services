package com.common.icici.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.common.icici.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByDept(@Param("dept") String dept);
}
