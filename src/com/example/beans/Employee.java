package com.example.beans;

public class Employee {
    private Integer empNo;
    private String employeeName;
    private Integer salary;
    public Employee(Integer empNo, String employeeName, Integer salary) {
        this.empNo = empNo;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "com.example.beans.Employee{" +
                "empNo=" + empNo +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
