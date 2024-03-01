package com.ecom.login.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "CustomerDetails")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    @NotNull
    private String firstName;

    private String lastName;

    private String emailId;

    private int age;

    @Size(min = 8)
    private String password;

    @Size(max = 10,min = 10)
    private String phoneNo;
}