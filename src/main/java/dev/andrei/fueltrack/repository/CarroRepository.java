package dev.andrei.fueltrack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.andrei.fueltrack.model.Veiculo;

@Repository
public interface CarroRepository extends CrudRepository<Veiculo, Long>{
    
}
