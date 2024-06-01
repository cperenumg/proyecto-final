package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@EnableTransactionManagement
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios")
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
