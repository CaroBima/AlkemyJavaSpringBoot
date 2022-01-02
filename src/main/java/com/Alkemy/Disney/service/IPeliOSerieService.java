
package com.Alkemy.Disney.service;

import com.Alkemy.Disney.model.PeliOSerie;
import java.util.List;


public interface IPeliOSerieService {
    public List<PeliOSerie> verPelisOSeries();
    public void agregarPeliOSerie (PeliOSerie peliOSerie);
    public void borrarPeliOSerie (int idPeliOSerie);
    public PeliOSerie buscarPeliOSerie(int idPeliOSerie);
    
}
