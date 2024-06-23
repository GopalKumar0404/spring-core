package org.gopal;

import java.util.List;

public class Student {
    private String studentName;
    private String studentId;
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
