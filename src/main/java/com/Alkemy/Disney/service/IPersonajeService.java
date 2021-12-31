package com.Alkemy.Disney.service;

import com.Alkemy.Disney.model.Personaje;
import java.util.List;


public interface IPersonajeService {
    
    public List<Personaje> verPersonajes();
    public void crearPersonaje(Personaje personaje);
    public void borrarPersonaje(int idPersonaje);
    public Personaje buscarPersonaje(int idPersonaje);
}
