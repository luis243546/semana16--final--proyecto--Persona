package com.personamicro2.personamicro2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Persona persona;

    public String getDoc(){
        if (persona.getTipo_documento().matches("^.{8}$")) {
            return "DNI";
        } 

        if (persona.getTipo_documento().matches("^.{11}$")) {
            return "RUC";
        } else {
            return null;
        }
    }

    public String getCorreo(){
        if (persona.getEmail().matches("^([a-zA-Z0-9_.+-]+)@hotmail.com$")) {
            return "META";
        } 

        if (persona.getEmail().matches("^([a-zA-Z0-9_.+-]+)@gmail.com$")) {
            return "GOOGLE";
        } 

        if (persona.getEmail().matches("^([a-zA-Z0-9_.+-]+)@outlook.com$")) {
            return "MICROSOFT";
        } else {
            return "NO RECONOCIDO";
        }
    }
}
