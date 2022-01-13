
package com.Alkemy.Disney.controller;

import com.Alkemy.Disney.Dto.DetallePersonajeDto;
import com.Alkemy.Disney.Dto.PersonajeDto;
import com.Alkemy.Disney.model.PeliOSerie;
import com.Alkemy.Disney.model.Personaje;
import com.Alkemy.Disney.service.IPersonajeService;
import com.Alkemy.Disney.service.PeliOSerieService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class PersonajeController {
    
    @Autowired
    private IPersonajeService personajeService;
            
          
    @PostMapping("/new")//crea y modifica
    public void agregarPersonaje(@RequestBody Personaje personaje){
        personajeService.crearPersonaje(personaje);
    }
    
     @DeleteMapping ("/delete/{id}")
    public void borrarPersonaje(@PathVariable int idpersonaje){
        
        personajeService.borrarPersonaje(idpersonaje);
    }
    
    @GetMapping("/detalle")
    public List<DetallePersonajeDto> verDetalle(){
        List<Personaje> listaPersonajes;
        List<DetallePersonajeDto> listaDetalle = new ArrayList();
        
                
        listaPersonajes= personajeService.verPersonajes();
        
        for( Personaje p : listaPersonajes){
            DetallePersonajeDto detalle = new DetallePersonajeDto();
            detalle.setIdPersonaje(p.getIdPersonaje());
            detalle.setImagenPersonaje(p.getImagenPersonaje());
            detalle.setNombre(p.getNombre());
            detalle.setEdad(p.getEdad());
            detalle.setPeso(p.getPeso());
            detalle.setHistoria(p.getHistoria());
            
            //Falta buscar el listado de peliculas para agregarlo
            //hay que hacerlo en la otra clase e invocarlo aca 
            //pasar por parametro el id a buscar
            PeliOSerieService pelisService = new PeliOSerieService();
            List<PeliOSerie> listaPelis = pelisService.verPelisOSeries();
           
//            for( PeliOSerie pos : listaPelis){
//                if(pos.getIdPeliOSerie() == ){
//                }
//            }
        
        }
        return listaDetalle;
    }
    
    @GetMapping()
    public List<PersonajeDto> verCharacters(){
        List<PersonajeDto> personajesDto = new ArrayList();
        
        
        //recupero el listado de personajes y lo asigno a la lista que se va a devolver
        List<Personaje> listaPersonajes= personajeService.verPersonajes();
        
        for( Personaje p : listaPersonajes){
            PersonajeDto perso = new PersonajeDto();
            perso.setImagen(p.getImagenPersonaje());
            perso.setNombre(p.getNombre());
            personajesDto.add(perso);
        }
        
        return personajesDto;
    }
    
    @GetMapping(params="age")  
    @ResponseBody  
       public List<Personaje> verPersonajesxedad(@RequestParam("age") String age){
        int edad = Integer.parseInt(age);
        return personajeService.buscarPersonajeXedad(edad);
        
    }
    
    @GetMapping(params="name")  
    public List<Personaje> verPersonajesxnombre(@RequestParam("name") String name){
        return personajeService.buscarPersonajeXnombre(name);
    }
    
    @GetMapping(params="movies")  
    public List<Personaje> buscarPersonajeXIdPeliOSerie(@RequestParam("movies") PeliOSerie idMovie){
        return personajeService.buscarPersonajeXId(idMovie);
    }
 
}
