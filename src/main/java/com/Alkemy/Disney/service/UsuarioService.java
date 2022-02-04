
package com.Alkemy.Disney.service;
import com.Alkemy.Disney.model.Usuario;
import com.Alkemy.Disney.repository.IUsuarioRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private IUsuarioRepository usuarioRepo;
    
    private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
    
    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String emailUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepo.findByEmail(emailUsuario);
        
        if(usuario == null){
            logger.error("Error en el logueo: El usuario " + emailUsuario + " no se encuentra registrado.");
            throw new UsernameNotFoundException("Error en el logueo: El usuario " + emailUsuario + " no se encuentra registrado.");
        }
        
        List<GrantedAuthority> authorities = usuario.getRoles()
                .stream()
                .map(rol->new SimpleGrantedAuthority(rol.getNombre()))
                .collect(Collectors.toList());
        return new User(usuario.getEmail(), usuario.getContraseña(), true, true, true, true, authorities); 
    }
    
}
