
package com.Alkemy.Disney.service;

import com.Alkemy.Disney.model.Genero;
import java.util.List;


public interface IGeneroService {
    public List<Genero> verGeneros();
    public void agregarGenero(Genero genero);
    public boolean borrarGenero(int idGenero);
    public Genero buscarGenero(int idGenero);
}
