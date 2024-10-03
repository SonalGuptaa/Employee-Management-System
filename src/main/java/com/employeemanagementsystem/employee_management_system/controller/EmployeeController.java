package com.employeemanagementsystem.employee_management_system.controller;


import com.employeemanagementsystem.employee_management_system.dto.EmployeeDto;
import com.employeemanagementsystem.employee_management_system.entity.Employee;
import com.employeemanagementsystem.employee_management_system.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp employeeServiceImp;


    //Create User Rest API
    @PostMapping
    public String saveEmployee(@RequestBody Employee employee)
    {
        employeeServiceImp.saveinfo(employee);
        return "User Saved";
    }

    @GetMapping
    public List<Employee> displayEmployee()
    {
        return employeeServiceImp.displayInfo();
    }


    @GetMapping("{id}")
    public Employee displayById(@PathVariable Integer id)
    {
        return employeeServiceImp.displayInfoByID(id);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee)
    {
         return employeeServiceImp.updateInfo(employee);
    }

    @DeleteMapping("{id}")
    public String deleteEmployee(@PathVariable("id") Integer id)
    {
        employeeServiceImp.deleteInfo(id);
        return id + " deleted successfully";
    }
}
