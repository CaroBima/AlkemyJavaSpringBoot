/*
3. Listado de Personajes
El listado deberá mostrar:
● Imagen.
● Nombre.
El endpoint deberá ser:
● /characters

*/
package com.Alkemy.Disney.Dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonajeDto implements Serializable {
    private String imagen;
    private String nombre;    
}