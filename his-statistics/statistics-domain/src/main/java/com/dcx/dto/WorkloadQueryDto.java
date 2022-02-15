package com.dcx.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Author: 董承轩
 */
@ApiModel(value = "com-dcx-dto-WorkloadQueryDto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class WorkloadQueryDto extends BaseDto {

    private String doctorName;

    private String queryDate;
}
