package com.Alkemy.Disney.service;

import com.Alkemy.Disney.model.PeliOSerie;
import com.Alkemy.Disney.repository.PeliOSerieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliOSerieService implements IPeliOSerieService{
    @Autowired 
    public PeliOSerieRepository peliOSerieRepo;

    @Override
    public List<PeliOSerie> verPelisOSeries() {
        return peliOSerieRepo.findAll();
    }

    @Override
    public void agregarPeliOSerie(PeliOSerie peliOSerie) {
        peliOSerieRepo.save(peliOSerie);
    }

    @Override
    public boolean borrarPeliOSerie(int idPeliOSerie) {
         try{
            peliOSerieRepo.deleteById(idPeliOSerie);
            return true;
        }catch(Exception err){
            return false;
        }
        
    }

    @Override
    public PeliOSerie buscarPeliOSerie(int idPeliOSerie) {
        return peliOSerieRepo.findById(idPeliOSerie).orElse(null);
    }
}
