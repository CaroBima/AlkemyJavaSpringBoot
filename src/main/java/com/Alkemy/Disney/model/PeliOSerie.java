
package com.Alkemy.Disney.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PeliOSerie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPeliOSerie;
    
    @Basic
    private String imagen;
    private String titulo;
    private int calificacion;
    
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    
    @JoinColumn
    @ManyToOne (cascade = CascadeType.MERGE)
    private Genero idGenero;

    
    @JoinTable(name = "persxpeli", joinColumns = {
                    @JoinColumn(name = "idPeliOSerie", nullable = false)},
                inverseJoinColumns = {
                    @JoinColumn(name = "idPersonaje", nullable = false)})
    @ManyToMany (cascade = CascadeType.ALL)
    private List<Personaje> idPersonaje;


}