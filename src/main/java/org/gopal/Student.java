package org.gopal;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Student {
    @Value("Gopal Kumar")
    private String studentName;
    @Value("Gopal Kumar studentId")
    private String studentId;
    @Value("{'1234567890','1234567890'}")
    private List<String> phones;

    public Student() {
    }

    public Student(String studentName, String studentId, List<String> phones) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.phones = phones;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", phones=" + phones +
                '}';
    }
}
