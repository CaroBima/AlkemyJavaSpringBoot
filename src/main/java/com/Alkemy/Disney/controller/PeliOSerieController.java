
package com.Alkemy.Disney.controller;

import com.Alkemy.Disney.model.PeliOSerie;
import com.Alkemy.Disney.service.IPeliOSerieService;
import java.util.List;
import javax.transaction.Transactional;
import static org.hibernate.bytecode.BytecodeLogging.LOGGER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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
    @Query(value = "SELECT u.imagen, u.titulo, u.fecha_Creacion FROM pelioserie u;", nativeQuery = false)
    public List<PeliOSerie> getAllPeliOSerie(){
    return peliOSerieService.getNombreAndTituloAndFechacreacion();
    }
   /* @Query(value = "SELECT u.imagen, u.titulo, u.fechaCreacion FROM pelioserie u;", nativeQuery = false)
    public Collection<PeliOSerie> buscarXImagTitFech(){
       return  peliOSerieService.verPelisOSeries();
    }*/
}
