package org.example.EADTEST.service;

import java.util.List;

import org.example.EADTEST.entity.Student;

public interface StudentService {
    List<Student> findAllStudents();
    Student findStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    boolean deleteStudent(Long id);
}
