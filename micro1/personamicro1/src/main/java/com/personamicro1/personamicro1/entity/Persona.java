package com.personamicro1.personamicro1.entity;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

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
