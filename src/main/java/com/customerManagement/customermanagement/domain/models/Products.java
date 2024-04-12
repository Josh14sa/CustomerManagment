package com.customerManagement.customermanagement.domain.models;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;


@Data
@Document(collection = "Products")
public class Products {

    @Id
    private Long idProduct;

    private String nombre;

    private String descripcion;

    private Double precio;

    private Integer stock;

    private String categoria;

    private Date fechaRegistro;

}
