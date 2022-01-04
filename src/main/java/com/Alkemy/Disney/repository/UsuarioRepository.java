package com.Alkemy.Disney.repository;

import com.Alkemy.Disney.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;




public interface UsuarioRepository extends JpaRepository<Usuario, String>{}
