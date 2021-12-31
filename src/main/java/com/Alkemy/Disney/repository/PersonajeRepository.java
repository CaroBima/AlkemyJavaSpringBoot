
package com.Alkemy.Disney.repository;

import com.Alkemy.Disney.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository <Personaje, Integer> {
    
}
