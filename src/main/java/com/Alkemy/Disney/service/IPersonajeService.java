package com.Alkemy.Disney.service;

import com.Alkemy.Disney.model.PeliOSerie;
import com.Alkemy.Disney.model.Personaje;
import java.util.List;


public interface IPersonajeService {
    
    public List<Personaje> verPersonajes();
    public void crearPersonaje(Personaje personaje);
    public boolean borrarPersonaje(int idPersonaje);
    public Personaje buscarPersonaje(int idPersonaje);
    public List<Personaje> buscarPersonajeXedad(int edad);
    public List<Personaje> buscarPersonajeXnombre(String nombre);
    public List<Personaje> buscarPersonajeXId(PeliOSerie id);
}
