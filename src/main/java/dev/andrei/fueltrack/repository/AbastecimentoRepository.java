package dev.andrei.fueltrack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.andrei.fueltrack.model.Abastecimento;

@Repository
public interface AbastecimentoRepository  extends CrudRepository<Abastecimento, Long>{
    
}
