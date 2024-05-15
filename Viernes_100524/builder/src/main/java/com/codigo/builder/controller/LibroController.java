package com.codigo.builder.controller;

import com.codigo.builder.entidad.Libro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/v1/patron/builder")
public class LibroController {

    @GetMapping("/librocompleto")
    public Libro obtenerLibro(){
        return new Libro.Builder()
                .titulo("Paco Yunque")
                .autor("Cesar Vallejo")
                .isbn("xxxxx-xxxxx-xxx-xxxx")
                .fechaPublicacion(LocalDate.of(1943, 4, 6))
                .build();
    }

    @GetMapping("/libropersonalizado")
    public Libro obtenerLibro2(){
        return new Libro.Builder()
                .titulo("Paco Yunque")
                .autor("Cesar Vallejo")
                .build();
    }
}
