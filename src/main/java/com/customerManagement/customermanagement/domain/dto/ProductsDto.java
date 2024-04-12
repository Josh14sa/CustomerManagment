package com.customerManagement.customermanagement.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProductsDto {

    private Long idProduct;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer stock;
    private String categoria;
    private Date fechaRegistro;
}
