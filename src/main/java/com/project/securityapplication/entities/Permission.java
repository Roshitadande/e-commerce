package com.project.securityapplication.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import jakarta.persistence.Id;
@Data
@Entity
public class Permission {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}

