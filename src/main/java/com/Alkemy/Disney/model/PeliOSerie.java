
package com.Alkemy.Disney.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeliOSerie {
    private int idPeliOSerie;
    
    private String imagen;
    private String titulo;
    private Date fechaCreacion;
    private int calificacion;
    private Genero idGenero;
}