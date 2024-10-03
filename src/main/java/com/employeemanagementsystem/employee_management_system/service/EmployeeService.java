package com.employeemanagementsystem.employee_management_system.service;

import com.employeemanagementsystem.employee_management_system.entity.Employee;
import java.util.*;
public interface EmployeeService {


    public void saveinfo(Employee employee);
    public List<Employee> displayInfo();
    public Employee displayInfoByID(Integer id);
    public Employee updateInfo(Employee employee);
    public void deleteInfo(Integer id);
}
