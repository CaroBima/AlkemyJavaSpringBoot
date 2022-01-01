
package com.Alkemy.Disney.controller;

import com.Alkemy.Disney.model.Genero;
import com.Alkemy.Disney.service.IGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneroController {
     @Autowired
    private IGeneroService generoService;
     
     @PostMapping("/new/genero")//crea y modifica
    public void agregarGenero(@RequestBody Genero genero){
        generoService.agregarGenero(genero);
    }
    
    
}
