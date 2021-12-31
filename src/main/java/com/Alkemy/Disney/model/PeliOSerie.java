
package com.Alkemy.Disney.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
    @OneToMany (cascade = CascadeType.MERGE)
    private List<Genero> idGenero;
}