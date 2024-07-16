package dev.andrei.fueltrack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.andrei.fueltrack.model.UsuarioVeiculo;

@Repository
public interface VeiculoUsuarioRepository extends CrudRepository<UsuarioVeiculo, Long> {
    
}
