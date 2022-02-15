package com.dcx.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Author: 董承轩
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Income extends BaseEntity {

    private Double orderAmount;  //收费总额度

    private String payType;//收费类型
}
