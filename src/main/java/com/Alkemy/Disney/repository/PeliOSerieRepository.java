package com.Alkemy.Disney.repository;

import com.Alkemy.Disney.model.PeliOSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliOSerieRepository extends JpaRepository <PeliOSerie, Integer>{
   
     

}
