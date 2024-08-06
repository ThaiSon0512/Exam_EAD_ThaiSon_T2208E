package org.example.EADTEST.service;

import java.util.List;

import org.example.EADTEST.entity.Subject;

public interface SubjectService {
    List<Subject> findAllSubjects();
    Subject findSubjectById(Long id);
    Subject createSubject(Subject subject);
    Subject updateSubject(Long id, Subject subject);
    boolean deleteSubject(Long id);
}
