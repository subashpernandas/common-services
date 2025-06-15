package com.example.common_service_own.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.common_service_own.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
