
package com.Alkemy.Disney.controller;

import com.Alkemy.Disney.model.PeliOSerie;
import com.Alkemy.Disney.service.IPeliOSerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliOSerieController {
    @Autowired
    private IPeliOSerieService peliOSerieService;
    
    @PostMapping("/new/PeliOSerie")
    public void agregarPeliOSerie( @RequestBody PeliOSerie peliOSerie){
        peliOSerieService.agregarPeliOSerie(peliOSerie);
    }
}
