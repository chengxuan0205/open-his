package com.dcx.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: 董承轩
 * 登陆用户的数据传输对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleUser implements Serializable {
    private Serializable userId;
    private String userName;
}
