package org.example.EADTEST.service;

import java.util.List;

import org.example.EADTEST.dto.StudentScoreDto;

public interface StudentScoreService {
    List<StudentScoreDto> findAllStudentScores();
    StudentScoreDto findStudentScoreById(Long id);
    StudentScoreDto createStudentScore(StudentScoreDto studentScoreDto);
    StudentScoreDto updateStudentScore(Long id, StudentScoreDto studentScoreDto);
    boolean deleteStudentScore(Long id);
}
