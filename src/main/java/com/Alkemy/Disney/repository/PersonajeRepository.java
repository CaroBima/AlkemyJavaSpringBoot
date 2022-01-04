
package com.Alkemy.Disney.repository;

import com.Alkemy.Disney.model.Personaje;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository <Personaje, Integer> {
    
    /*
    @Query("select pers from Personaje pers where pers.nombre like :nombre order by pers.nombre")
    List<Personaje> buscaPorNombre(@Param("nombre") String nombre);
    */
    
    List<Personaje> findIsLikeEdadOrderByEdad(String edad);
    
     List<Personaje> findIsLikeNombreOrderByNombre(String nombre);

}


