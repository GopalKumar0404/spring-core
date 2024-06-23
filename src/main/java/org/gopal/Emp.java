package org.gopal;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    private String employeeName;
    private String employeeId;

    public Emp() {
    }

    public Emp(String employeeName, String employeeId) {
        System.out.println("constructor injection working");
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
