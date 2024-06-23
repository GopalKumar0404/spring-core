package org.gopal;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoStudent {
    @Autowired
    private Student student;
    @Autowired
    private Emp emp;

    public DemoStudent() {
    }

    public DemoStudent(Student student, Emp emp) {
        this.student = student;
        this.emp = emp;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "DemoStudent{" +
                "student=" + student +
                ", emp=" + emp +
                '}';
    }
}
