package com.Alkemy.Disney.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="personajes")
public class Personaje implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idPersonaje;
    
    @Column(length=450)
    private String imagenPersonaje;
    
    @Column(name="nombre", length= 80)
    private String nombre;
    
    @Column(name="edad")
    private int edad;
    
    @Column(name="peso")
    private double peso;
    
    @Column(name="historia", length= 450)
    private String historia;
    
    @JsonBackReference
    @ManyToMany(fetch=FetchType.LAZY,  mappedBy = "idPersonaje", cascade = CascadeType.ALL)
    private List<PeliOSerie> idPeliOSerie;
}
