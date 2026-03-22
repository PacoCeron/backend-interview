package com.pacoceronspringboot.entrevista_backend.controller; // Ajusta tu package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String obtenerSaludo() {
        System.out.println("-> Petición recibida en /saludo");
        return "¡Hola! Preparándome para la entrevista técnica. Vamos por ello.";
    }
}
