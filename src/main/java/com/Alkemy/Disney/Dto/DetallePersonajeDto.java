/*
Clase para poder retornar el detalle de personaje solicitado:
5. Detalle de Personaje
En el detalle deberán listarse todos los atributos del personaje, como así también sus películas o
series relacionadas.
 */
package com.Alkemy.Disney.Dto;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetallePersonajeDto {
    int idPersonaje;
    private String imagenPersonaje;
    private String nombre;
    private int edad;
    private double peso;
    private String historia;
    private List<String> tituloPeliOSerie;
}
