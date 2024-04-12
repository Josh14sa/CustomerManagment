package com.customerManagement.customermanagement.domain.dto;

import lombok.Data;

@Data
public class UsersDto {
    private Long id;
    private String username;
    private String password;
    private String email;
}
