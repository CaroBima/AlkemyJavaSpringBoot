
package com.Alkemy.Disney.controller;

import com.Alkemy.Disney.model.Personaje;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonajeController {
    List<Personaje> listaPersonajes = new ArrayList();
    
    
    @PostMapping("/new/personaje")
    public void agregarPersonaje(@RequestBody Personaje personaje){
        listaPersonajes.add(personaje);
    }
    
    
    @GetMapping("/characters")
    @ResponseBody  
    public List<Personaje> verPersonajes(){
        return listaPersonajes;
    }
}
