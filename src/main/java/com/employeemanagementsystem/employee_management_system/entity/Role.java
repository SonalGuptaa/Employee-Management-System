//package com.employeemanagementsystem.employee_management_system.entity;
//import java.util.*;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name="employee_role")
//@Setter
//@Getter
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "roleID")
//    private int roleId;
//
//    @Column(name = "roleName")
//    private String roleName;
//
//    @ManyToMany(mappedBy = "roles" , cascade = CascadeType.ALL)
//    @JsonIgnore
//    private List<Employee> employeeList  = new ArrayList<>();
//
//}
