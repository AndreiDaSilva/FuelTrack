package dev.andrei.fueltrack.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.andrei.fueltrack.model.Usuario;
import dev.andrei.fueltrack.repository.UsuarioRepository;
import dev.andrei.fueltrack.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Iterable<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    @Override
    public void inserir(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void atualizar(Long id, Usuario usuario) {
        Optional<Usuario> usuarioIsEmpity = usuarioRepository.findById(id);
        if (usuarioIsEmpity.isPresent()) {
            usuarioRepository.save(usuario);
        }
    }
    
}
