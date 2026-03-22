package com.pacoceronspringboot.entrevista_backend.controller;

import com.pacoceronspringboot.entrevista_backend.model.libro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/libros") // Ruta base para todo el controlador
public class LibroController {

    // Lista en memoria (para simular base de datos)
    private List<libro> libros = new ArrayList<>();

    public LibroController() {
        // Unos datos de ejemplo
        libros.add(new libro(UUID.randomUUID().toString(), "El Principito", "Saint-Exupéry"));
        libros.add(new libro(UUID.randomUUID().toString(), "Cien años de soledad", "García Márquez"));
    }

    // GET /libros - Devuelve todos los libros
    @GetMapping
    public List<libro> obtenerTodosLoslibros() {
        return libros;
    }     

    // POST /libros - Crea un nuevo libro
    @PostMapping
    public libro crearlibro(@RequestBody libro nuevolibro) {
        // En un caso real, la base de datos genera el ID. Aquí lo simulamos.
        nuevolibro.setId(UUID.randomUUID().toString());
        libros.add(nuevolibro);
        System.out.println("-> libro creado: " + nuevolibro.getTitle());
        return nuevolibro; // Devolvemos el libro creado con su nuevo ID
    }
}
