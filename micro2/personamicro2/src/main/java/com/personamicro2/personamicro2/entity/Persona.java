package com.personamicro2.personamicro2.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Persona {
    private Long id_persona;
    private LocalDate fecha_nacimiento;
    private String genero;
    private String nombre;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;
}
