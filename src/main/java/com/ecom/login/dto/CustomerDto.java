package com.ecom.login.dto;

import com.ecom.login.entities.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
    @Size(min = 8)
    @Pattern(regexp = "^[a-zA-Z0-9]{8,15}", message = "length must me 8 or more")
    private String password;
    @Size(min = 10, max = 10)
    private String phoneNo;
    private List<Address> address;
}
