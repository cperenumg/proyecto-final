package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuarios")
    public List <Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Cristian");
        usuario.setApellido("Perén");
        usuario.setEmail("cristianpp27@gmail.com");
        usuario.setTelefono("5326 - 3917");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2);
        usuario2.setNombre("Luis");
        usuario2.setApellido("Perén");
        usuario2.setEmail("luispp27@gmail.com");
        usuario2.setTelefono("5327 - 3917");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3);
        usuario3.setNombre("Sussan");
        usuario3.setApellido("Perén");
        usuario3.setEmail("sussanpp27@gmail.com");
        usuario3.setTelefono("5328 - 3917");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Integer id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Cristian");
        usuario.setApellido("Perén");
        usuario.setEmail("cristianpp27@gmail.com");
        usuario.setTelefono("5326 - 3917");

        return usuario;
    }

    @RequestMapping(value = "usuarioModificar")
    public Usuario modificar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Perén");
        usuario.setEmail("cristianpp27@gmail.com");
        usuario.setTelefono("5326 - 3917");

        return usuario;
    }

    @RequestMapping(value = "usuarioEliminar")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Perén");
        usuario.setEmail("cristianpp27@gmail.com");
        usuario.setTelefono("5326 - 3917");

        return usuario;
    }

        @RequestMapping(value = "usuarioBuscar")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Cristian");
        usuario.setApellido("Perén");
        usuario.setEmail("cristianpp27@gmail.com");
        usuario.setTelefono("5326 - 3917");

        return usuario;
    }
}
