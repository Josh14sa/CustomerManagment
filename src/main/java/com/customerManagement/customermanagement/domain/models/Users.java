package com.customerManagement.customermanagement.domain.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Users")
public class Users {
    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
}
