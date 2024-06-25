package com.proyect.park.repository;

import com.proyect.park.models.dto.UsuarioDto;
import com.proyect.park.models.entities.*;
import com.proyect.park.repositories.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static  org.junit.jupiter.api.Assertions.*;
import static  org.assertj.core.api.Assertions.assertThat;
import java.util.List;

@DataJpaTest
public class UsuarioRepositoryTest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private UsuarioDto usuario;

    private Usuario usuarioOriginal;

    private Vehiculo vehiculo;

    private ZonaAparcamiento zonaAparcamiento;

    private Comentario comentario;
    List<Vehiculo> vehiculos= null;
    List<ZonaAparcamiento> zonaAparcamientos= null;
    List<Comentario> comentarios= null;
    List<Role> roles= null;
    @BeforeEach
    void setup(){
        usuarioOriginal = new Usuario(1L,"omar","12345",991117845L,"omar@gmail.com",1,roles,vehiculos,zonaAparcamientos,comentarios);
    }

    @Test
    @DisplayName("Test para guardar un Usuario")
    void testGuardarUsuario(){
        // Given
        Usuario usuarioAux = new Usuario(1L,"maxs","12345",992227845L,"max@gmail.com",1,roles,vehiculos,zonaAparcamientos,comentarios);

        //When
        Usuario usuarioGuardado = usuarioRepository.save(usuarioAux);

        //Then
        assertEquals(usuarioGuardado.getId(),1);




    }


}
