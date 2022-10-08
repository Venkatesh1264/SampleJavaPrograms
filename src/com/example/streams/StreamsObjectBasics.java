package com.example.streams;

import com.example.beans.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
  What is stream?
  limit operator
  filter and map opertor
  reducer operator
  sorting and reverse sorting
  joining
 */
public class StreamsObjectBasics {
    public static void main(String[] args) {
        StreamsObjectBasics streamsObjectBasics = new StreamsObjectBasics();
        List<Employee> employeeList = streamsObjectBasics.getEmployees();
        System.out.println("Printing first 4 employee objects from the list");
        employeeList.stream().limit(4).forEach(System.out::println);

        System.out.println("\nEmployee salary lessthan 5000");
        List<Employee> salaryLessThan5kEmployees = employeeList.stream().filter(employee -> employee.getSalary()<5000).collect(Collectors.toList());
        salaryLessThan5kEmployees.forEach(System.out::println);

        System.out.println("\nDoubled the employee salary where whose salary is lessthan 5000");
        employeeList.stream().filter(employee -> employee.getSalary()<5000).map(employee -> {
            employee.setSalary(employee.getSalary()*2);
            return employee;
        }).forEach(System.out::println);

        System.out.println("\nPrinting the emploees in a sorted order by salary ascending order");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        String employeeNames = employeeList.stream().map(employee -> employee.getEmployeeName()).collect(Collectors.joining(","));
        System.out.println("Employee names by joining with comma(,) seperator: "+ employeeNames);
    }
    public List<Employee> getEmployees() {
        Employee e1 = new Employee(10, "Ganesh", 1000);
        Employee e2 = new Employee(20, "Rajesh", 3000);
        Employee e3 = new Employee(30, "Sarvesh", 9000);
        Employee e4 = new Employee(40, "Vinesh", 4000);
        Employee e5 = new Employee(50, "Radha", 2000);
        Employee e6 = new Employee(60, "Syam", 5000);
        Employee e7 = new Employee(70, "Ryan", 7000);
        return Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
    }

 }
