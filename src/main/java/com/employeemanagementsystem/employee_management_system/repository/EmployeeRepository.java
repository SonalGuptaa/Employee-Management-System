package com.employeemanagementsystem.employee_management_system.repository;

import com.employeemanagementsystem.employee_management_system.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
