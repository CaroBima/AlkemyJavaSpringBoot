
package com.Alkemy.Disney.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personaje {
    private int idPersonaje;
    private String imagenPersonaje;
    private String nombre;
    private String edad;
    private double peso;
    private String historia;
    private int idPeliOSerie; //Cambiarlo cuando este solucionado el problema con jpa
    //private PeliOSerie idPeliOSerie;
}
