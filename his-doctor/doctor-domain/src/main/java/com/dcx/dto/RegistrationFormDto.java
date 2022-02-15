package com.dcx.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 董承轩
 */
@ApiModel(value = "com-dcx-dto-RegistrationFormDto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationFormDto implements Serializable {

    private PatientDto patientDto;

    private RegistrationDto registrationDto;
}
