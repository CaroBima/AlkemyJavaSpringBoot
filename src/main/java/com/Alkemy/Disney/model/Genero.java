
package com.Alkemy.Disney.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Genero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int idGenero;
    
    @Basic
    public String nombre;
    public String imagenGenero;

}
