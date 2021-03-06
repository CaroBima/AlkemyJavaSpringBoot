
package com.Alkemy.Disney.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="generos")
public class Genero implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idGenero;
    
    @Column(name="nombre", unique=true, length=50)
    public String nombre;
    
    @Column(name="imagenGenero", length=450)
    public String imagenGenero;

}
