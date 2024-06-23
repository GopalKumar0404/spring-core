package org.gopal.dao.impl;

import org.gopal.dao.StudentDao;
import org.gopal.entites.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Student student) {

        String query = "insert into student values (?,?,?)";
        return jdbcTemplate.update(query, student.getStudentId(), student.getStudentName(), student.getStudentAddress());

    }

    @Override
    public int update(Student student) {
        String query = "update student set studentName=?, studentAddress=? where studentId =?";
        return jdbcTemplate.update(query, student.getStudentName(),student.getStudentAddress(),student.getStudentId());
    }

    @Override
    public int delete(int id) {
        String query = "delete from student where studentId = ?";
        return jdbcTemplate.update(query,id);
    }

    @Override
    public Student getStudent(int id) {
        String query = "select * from student where studentId =? ";
        RowMapperImpl rowMapper = new RowMapperImpl();
        return jdbcTemplate.queryForObject(query,rowMapper,id);
    }

    @Override
    public List<Student> getAllStudent() {
        String query = "select * from student";
        return jdbcTemplate.query(query,new RowMapperImpl());
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
