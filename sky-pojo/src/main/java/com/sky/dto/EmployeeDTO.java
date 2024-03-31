package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

// TODO 所有的DTO都实现了Serializable接口，我不知道用意何在，先加个TODO在这，后面可能会提及原因
@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
