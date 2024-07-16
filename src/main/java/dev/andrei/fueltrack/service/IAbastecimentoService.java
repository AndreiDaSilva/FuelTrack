package dev.andrei.fueltrack.service;

import dev.andrei.fueltrack.model.Abastecimento;

public interface IAbastecimentoService {

    Iterable<Abastecimento> buscarTodos();

    void inserir(Abastecimento abastecimento);

    void atualizar(Long id, Abastecimento abastecimento);

    void excluir(Long id);
    
}
