package com.personamicro1.personamicro1.entity;

import java.time.LocalDate;
import java.time.Period;



public class Item {
    private Persona persona;
    /*private LocalDate fechaNacimiento;

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }*/

    
    public Item() {
    }

    public Item(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /*public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - persona.getFecha_nacimiento().getYear();
    }*/

    public int getDiaCumpleaños() {
        return persona.getFecha_nacimiento().getDayOfMonth();
    }

    public int getMesCumpleaños() {
        return persona.getFecha_nacimiento().getMonthValue() ;
    }

    public String getMes(){
        if (getMesCumpleaños()==1) {
            return "enero";
        }
        if (getMesCumpleaños()==2) {
            return "febrero";
        }
        if (getMesCumpleaños()==3) {
            return "marzo";
        }
        if (getMesCumpleaños()==4) {
            return "abril";
        }
        if (getMesCumpleaños()==5) {
            return "mayo";
        }
        if (getMesCumpleaños()==6) {
            return "junio";
        }
        if (getMesCumpleaños()==7) {
            return "julio";
        }
        if (getMesCumpleaños()==8) {
            return "agosto";
        }
        if (getMesCumpleaños()==9) {
            return "setiembre";
        }
        if (getMesCumpleaños()==10) {
            return "octubre";
        }
        if (getMesCumpleaños()==11) {
            return "noviembre";
        } else {
            return "diciembre";
        }
    }

    public int getAñoCumpleaños() {
        return persona.getFecha_nacimiento().getYear();
    }



    public int getEdad(){
        return Period.between(persona.getFecha_nacimiento(), LocalDate.now()).getYears();
    }

    public String getGender() {
	
		if (persona.getGenero().equals("0")) {
			return "Masculino";
		} 

        if (persona.getGenero().equals("1")) {
            return "Femenino";
        } else {
            return null;
        }

    }

    /*public String getDoc(){
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
    }*/


    
}
