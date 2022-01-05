
package com.Alkemy.Disney.service;

import com.Alkemy.Disney.model.Genero;
import com.Alkemy.Disney.repository.GeneroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService implements IGeneroService {

    @Autowired
    public GeneroRepository generoRepo;
     
    @Override
    public List<Genero> verGeneros() {
        return generoRepo.findAll();
    }

    @Override
    public void agregarGenero(Genero genero) {
        generoRepo.save(genero);
    }

    @Override
    public boolean borrarGenero(int idGenero) {
        try{
            generoRepo.deleteById(idGenero);
            return true;
        }catch(Exception err){
            return false;
        }
        
    }

    @Override
    public Genero buscarGenero(int idGenero) {
        return generoRepo.findById(idGenero).orElse(null);
    }
    
}
