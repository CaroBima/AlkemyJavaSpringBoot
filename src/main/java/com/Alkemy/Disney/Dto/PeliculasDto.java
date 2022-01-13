/*
    permite devolver la informacion de las peliculas o series

7. Listado de Películas
Deberá mostrar solamente los campos imagen, título y fecha de creación.
El endpoint deberá ser:
● GET /movies


 */
package com.Alkemy.Disney.Dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeliculasDto {
    String imagen;
    String titulo;
    Date fechaCreacion;
}
