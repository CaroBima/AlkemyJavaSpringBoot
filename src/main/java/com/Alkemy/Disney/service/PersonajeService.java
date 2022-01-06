package com.Alkemy.Disney.service;

import com.Alkemy.Disney.model.PeliOSerie;
import java.util.List;
import com.Alkemy.Disney.model.Personaje;
import com.Alkemy.Disney.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonajeService implements IPersonajeService{

    @Autowired
    public PersonajeRepository personajeRepo;
    
    @Override
    public List<Personaje> verPersonajes() {
       return personajeRepo.findAll();
    }

    @Override
    public void crearPersonaje(Personaje personaje) {
        personajeRepo.save(personaje);
    }

    
    @Override
    public boolean borrarPersonaje(int idPersonaje) {
       try{
            personajeRepo.deleteById(idPersonaje);
            return true;
        }catch(Exception err){
            return false;
        }
        
    }

    @Override
    public Personaje buscarPersonaje(int idPersonaje){
       return personajeRepo.findById(idPersonaje).orElse(null);//si no encuentra la persona, retorna null
    }

    @Override
    public List<Personaje> buscarPersonajeXedad(String edad) {
      return personajeRepo.findIsLikeEdadOrderByEdad(edad);
    }

    @Override
    public List<Personaje> buscarPersonajeXnombre(String nombre) {
        return personajeRepo.findIsLikeNombreOrderByNombre(nombre);
    }

    @Override
    public List<Personaje> buscarPersonajeXId(PeliOSerie id) {
        return personajeRepo.findIsLikeidPeliOSerieOrderByidPeliOSerie(id);
    }

   
}     