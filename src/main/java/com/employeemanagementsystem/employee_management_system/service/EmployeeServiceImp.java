package com.employeemanagementsystem.employee_management_system.service;
import java.util.*;
import com.employeemanagementsystem.employee_management_system.controller.EmployeeController;
import com.employeemanagementsystem.employee_management_system.entity.Employee;
import com.employeemanagementsystem.employee_management_system.repository.EmployeeRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;



    @Override
    public void saveinfo(Employee employee){
        employeeRepository.save(employee);

    }

    @Override
    public  List<Employee> displayInfo(){
        return employeeRepository.findAll();
    }


    @Override
    public Employee displayInfoByID(Integer id)
    {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee updateInfo(Employee employee)
    {
        return employeeRepository.save(employee);
//        Employee employeefromDb = employeeRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Employee not found for id"));
//
//        employeefromDb.setName(employee.getName());
//        employeefromDb.setAge(employee.getAge());
//
//        for(int i=0;i<employeefromDb.getAddresses().size();i++)
//        {
//            employeefromDb.getAddresses().get(i).setAddressType(employee.getAddresses().get(i).getAddressType());
//            employeefromDb.getAddresses().get(i).setCity(employee.getAddresses().get(i).getCity());
//        }
//
//        employeeRepository.save(employeefromDb);
//        return employeefromDb;

    }

    @Override
    public void deleteInfo(Integer id)
    {
        employeeRepository.deleteById(id);
    }
}
