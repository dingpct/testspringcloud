package com.ding.repository;

import com.ding.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);

}
