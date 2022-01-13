
package com.Alkemy.Disney.controller;

import com.Alkemy.Disney.Dto.PeliculasDto;
import com.Alkemy.Disney.model.PeliOSerie;
import com.Alkemy.Disney.service.IPeliOSerieService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

   
    @GetMapping("/movies")
    public List<PeliculasDto> mostrarPeliOSerie(){
        List<PeliculasDto> listaPelisDto = new ArrayList();
        List<PeliOSerie> listaPelis = peliOSerieService.verPelisOSeries();
        
        for (PeliOSerie p : listaPelis){
            PeliculasDto peliDto = new PeliculasDto();
            peliDto.setFechaCreacion(p.getFechaCreacion());
            peliDto.setImagen(p.getImagen());
            peliDto.setTitulo(p.getTitulo());
            listaPelisDto.add(peliDto);
        }
        return listaPelisDto;
    }
}
