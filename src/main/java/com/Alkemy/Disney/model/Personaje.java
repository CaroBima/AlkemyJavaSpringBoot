
package com.Alkemy.Disney.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idPersonaje;
    
   @Basic
    private String imagenPersonaje;
    private String nombre;
    private String edad;
    private double peso;
    private String historia;
    
    @JsonBackReference
    @ManyToMany(fetch=FetchType.LAZY,  mappedBy = "idPersonaje", cascade = CascadeType.ALL)
    private List<PeliOSerie> idPeliOSerie;
}
