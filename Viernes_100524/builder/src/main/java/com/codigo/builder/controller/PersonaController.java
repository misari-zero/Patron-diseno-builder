package com.codigo.builder.controller;

import com.codigo.builder.entidad.Libro;
import com.codigo.builder.entidad.Persona;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/v1/patron/builder")
public class PersonaController {
    @GetMapping("/personacompleto")
    public Persona obtenerPersona(){
        return new Persona.Builder()
                .nombre("Gian")
                .apellido("misari")
                .edad(29)
                .fechaNacimiento(LocalDate.of(1995, 4, 5))
                .direccion("Av. Imperial 546")
                .email("gmisari5@gmail.com")
                .telefono("921084639")
                .genero("Masculino")
                .estadoCivil("Soltero")
                .nacionalidad("Peruana")
                .build();
    }

    @GetMapping("/personapersonalizado")
    public Persona obtenerPersona2(){
        return new Persona.Builder()
                .nombre("Gian")
                .apellido("misari")
                .edad(29)
                .build();
    }
}
