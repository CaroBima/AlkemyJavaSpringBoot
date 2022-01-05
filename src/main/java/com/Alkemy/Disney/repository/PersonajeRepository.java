
package com.Alkemy.Disney.repository;

import com.Alkemy.Disney.model.PeliOSerie;
import com.Alkemy.Disney.model.Personaje;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository <Personaje, Integer> {
    
    @Query(value = "select imagen, nombre from personaje;" ,nativeQuery = true)
    public Iterable<Object[]> verDetalle();
    
    List<Personaje> findIsLikeEdadOrderByEdad(String edad);
    
    List<Personaje> findIsLikeNombreOrderByNombre(String nombre);
     
    List<Personaje> findIsLikeidPeliOSerieOrderByidPeliOSerie(PeliOSerie id); 

 
}


