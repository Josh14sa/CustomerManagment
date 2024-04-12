package com.customerManagement.customermanagement.domain.dto;

import lombok.Data;

import java.util.Date;
@Data
public class ClientDto {
    private Integer idcliente;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaRegistro;
}
