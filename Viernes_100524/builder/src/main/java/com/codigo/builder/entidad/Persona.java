package com.codigo.builder.entidad;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String email;
    private String telefono;
    private String genero;
    private String estadoCivil;
    private String nacionalidad;

    private Persona(Persona.Builder builder){
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.edad = builder.edad;
        this.fechaNacimiento = builder.fechaNacimiento;
        this.direccion = builder.direccion;
        this.email = builder.email;
        this.telefono = builder.telefono;
        this.genero = builder.genero;
        this.estadoCivil = builder.estadoCivil;
        this.nacionalidad = builder.nacionalidad;
    }
    public static class Builder{
        private String nombre;
        private String apellido;
        private int edad;
        private LocalDate fechaNacimiento;
        private String direccion;
        private String email;
        private String telefono;
        private String genero;
        private String estadoCivil;
        private String nacionalidad;


        public Persona.Builder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        public Persona.Builder apellido(String apellido){
            this.apellido = apellido;
            return this;
        }
        public Persona.Builder edad (Integer edad){
            this.edad = edad;
            return this;
        }
        public Persona.Builder fechaNacimiento(LocalDate fechaNacimiento){
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }
        public Persona.Builder direccion(String direccion){
            this.direccion = direccion;
            return this;
        }
        public Persona.Builder email(String email){
            this.email = email;
            return this;
        }
        public Persona.Builder telefono(String telefono){
            this.telefono = telefono;
            return this;
        }
        public Persona.Builder genero(String genero){
            this.genero = genero;
            return this;
        }
        public Persona.Builder estadoCivil(String estadoCivil){
            this.estadoCivil = estadoCivil;
            return this;
        }
        public Persona.Builder nacionalidad(String nacionalidad){
            this.nacionalidad = nacionalidad;
            return this;
        }
        public Persona build(){
            return new Persona(this);
        }
    }
}
