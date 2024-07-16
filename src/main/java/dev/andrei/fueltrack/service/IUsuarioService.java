package dev.andrei.fueltrack.service;

import dev.andrei.fueltrack.model.Usuario;

public interface IUsuarioService {

    Iterable<Usuario> buscarTodos();
    
    void inserir(Usuario usuario);

    void atualizar(Long id, Usuario usuario);
}
