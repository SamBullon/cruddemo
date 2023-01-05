package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findALL();
    public Employee findById(int theId);
    public void save(Employee theEmployee);
    public void deleteById(int theId);

}
