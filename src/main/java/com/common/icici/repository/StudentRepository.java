package com.common.icici.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.common.icici.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
