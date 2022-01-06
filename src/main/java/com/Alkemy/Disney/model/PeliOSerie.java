
package com.Alkemy.Disney.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Table(name="pelisoseries")
public class PeliOSerie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPeliOSerie;
    
    @Column (name="imagen", length=450)
    private String imagen;
    
    @Column (name="titulo", length=80)
    private String titulo;
    
    @Column (name="calificacion")
    private int calificacion;
    
    @Column(name="fechaCreacion")
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