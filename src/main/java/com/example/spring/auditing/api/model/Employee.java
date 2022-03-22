package com.example.spring.auditing.api.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity

public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Date doj;
    private String dept;
    private double salary;

    @CreatedDate
    private long createDate;
    @LastModifiedDate
    private long lastModifiedDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String modifiedBy;



}
