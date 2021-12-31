/*
Género: deberá tener,

○ Nombre.
○ Imagen.
○ Películas o series asociadas.
*/
package com.Alkemy.Disney.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Genero {
    public int idGenero;
    public String nombre;
    public String imagenGenero;
}
