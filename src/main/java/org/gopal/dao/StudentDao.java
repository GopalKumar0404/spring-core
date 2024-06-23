package org.gopal.dao;

import org.gopal.entites.Student;

import java.util.List;

public interface StudentDao {
    int create(Student student);

    int update(Student student);
    int delete(int id);
    Student getStudent(int id);
    List<Student> getAllStudent();
}
