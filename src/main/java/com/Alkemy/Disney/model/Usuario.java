package com.Alkemy.Disney.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class Usuario {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;
    
//    @Basic
    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;
    
}
