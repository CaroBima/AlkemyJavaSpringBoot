
package com.Alkemy.Disney.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PeliOSerie {
    private double idPeliOSerie;
    
    private String imagen;
    private String titulo;
    private Date fechaCreacion;
    private int calificacion;
    private Genero idGenero;
}