
package com.Alkemy.Disney.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    
    @JoinColumn
    @ManyToOne (cascade = CascadeType.MERGE)
    private PeliOSerie idPeliOSerie;
}
