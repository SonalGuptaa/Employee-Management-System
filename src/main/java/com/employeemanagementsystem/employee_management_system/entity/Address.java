package com.employeemanagementsystem.employee_management_system.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.boot.beanvalidation.IntegrationException;

@Entity
@Table(name="employee_address")
@Setter
@Getter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressID")
    private Integer addressId;

    @Column(name = "city")
    private String city;

    @Column(name = "addressType")
    private String addressType;

}
