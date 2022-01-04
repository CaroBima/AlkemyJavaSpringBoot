
package com.Alkemy.Disney.controller;

import com.Alkemy.Disney.model.Personaje;
import com.Alkemy.Disney.service.IPersonajeService;
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
    
    
   /* @GetMapping("/characters")
    @ResponseBody  
    public List<Personaje> verPersonajes(){
        return personajeService.verPersonajes();
        
    }
*/
    
    @GetMapping(params="age")  
    @ResponseBody  
       public List<Personaje> verPersonajesxedad(@RequestParam("age") String age){
        return personajeService.buscarPersonajeXedad(age);
        
    }
    
    @GetMapping(params="name")  
    public List<Personaje> verPersonajesxnombre(@RequestParam("name") String name){
        return personajeService.buscarPersonajeXnombre(name);
        
    }
    
 
}
