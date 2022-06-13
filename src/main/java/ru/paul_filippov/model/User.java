package ru.paul_filippov.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 12, message = "Name should be between 2 and 12 characters")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 12, message = "Name should be between 2 and 12 characters")
    private String surName;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be greater than 0")
    private byte age;
    @Column(name = "email")
    @Email
    @NotEmpty(message = "Email should not be empty")
    private String email;

}

