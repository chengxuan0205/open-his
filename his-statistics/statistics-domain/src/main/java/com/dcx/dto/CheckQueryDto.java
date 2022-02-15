package com.dcx.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Author: 董承轩
 */
@ApiModel(value = "com-dcx-dto-CheckQueryDto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CheckQueryDto extends BaseDto {

    private String patientName;

    private String checkItemId;

    private String queryDate;
}
