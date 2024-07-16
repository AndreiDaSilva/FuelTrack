package dev.andrei.fueltrack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.andrei.fueltrack.model.Usuario;
import dev.andrei.fueltrack.service.IUsuarioService;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {
       
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<Iterable<Usuario>> buscarTodo(){
        return ResponseEntity.ok(usuarioService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Usuario> inserir(@RequestBody Usuario usuario){
        usuarioService.inserir(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizar(@RequestBody Long id, @RequestBody Usuario usuario){
        usuarioService.atualizar(id, usuario);
        return ResponseEntity.ok(usuario);
    }


}
