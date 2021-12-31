
package com.Alkemy.Disney.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Personaje {
    private double idPersonaje;
    private String imagenPersonaje;
    private String nombre;
    private String edad;
    private double peso;
    private String historia;
    private int idPeliOSerie; //CAMBIArlo cuando este solucionado el problema con jpa
    //private PeliOSerie idPeliOSerie;
}
