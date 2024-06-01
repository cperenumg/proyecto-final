package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@EnableTransactionManagement
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List <Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Integer id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setCodigo("asdfasdf");
        usuario.setNombre("Cristian");
        usuario.setApellido("Perén");
        usuario.setEmail("cristianpp27@gmail.com");
        usuario.setTelefono("5326 - 3917");

        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void RegistrarUsuario(@RequestBody Usuario usuario) {

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, usuario.getPassword());
        usuario.setPassword(hash);

        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "usuarioModificar")
    public Usuario modificar() {
        Usuario usuario = new Usuario();
        usuario.setCodigo("asdfasdf");
        usuario.setNombre("Cristian");
        usuario.setApellido("Perén");
        usuario.setEmail("cristianpp27@gmail.com");
        usuario.setTelefono("5326 - 3917");

        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Integer id) {
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "usuarioBuscar")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setCodigo("asdfasdf");
        usuario.setNombre("Cristian");
        usuario.setApellido("Perén");
        usuario.setEmail("cristianpp27@gmail.com");
        usuario.setTelefono("5326 - 3917");

        return usuario;
    }
}
