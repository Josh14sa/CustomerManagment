package com.customerManagement.customermanagement.domain.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "Clients")
public class Clients {
    @Id
    private Long id;
    private String name;
    private String lastName;
    private String mail;
    private Date registrationDate;
}
