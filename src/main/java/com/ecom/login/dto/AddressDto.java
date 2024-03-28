package com.ecom.login.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto implements Serializable {

    private static final long serialVersionUID = 1L;
    @NotNull
    private String areaField1;
    private String areaField2;
    @NotNull
    private String city;
    @NotNull
    @Size(min = 6, max = 6)
    private String pincode;
    @NotNull
    private String state;
    private String country;
}
