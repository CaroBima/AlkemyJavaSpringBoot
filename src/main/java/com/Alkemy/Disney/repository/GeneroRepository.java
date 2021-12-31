
package com.Alkemy.Disney.repository;

import com.Alkemy.Disney.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository  extends JpaRepository <Genero, Integer>{
    
}
