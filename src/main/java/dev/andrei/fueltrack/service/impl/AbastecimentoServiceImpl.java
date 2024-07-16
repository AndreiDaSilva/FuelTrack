package dev.andrei.fueltrack.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.andrei.fueltrack.model.Abastecimento;
import dev.andrei.fueltrack.repository.AbastecimentoRepository;
import dev.andrei.fueltrack.service.IAbastecimentoService;

@Service
public class AbastecimentoServiceImpl implements IAbastecimentoService{

    @Autowired
    private AbastecimentoRepository abastecimentoRepository;


    @Override
    public Iterable<Abastecimento> buscarTodos() {
        return abastecimentoRepository.findAll();
    }

    @Override
    public void inserir(Abastecimento abastecimento) {
        abastecimentoRepository.save(abastecimento);
    }

    @Override
    public void atualizar(Long id, Abastecimento abastecimento) {
        if (abastecimentoIsEmpity(id)) {
            abastecimentoRepository.save(abastecimento);
        }
    }

    @Override
    public void excluir(Long id) {
        if (abastecimentoIsEmpity(id)) {
            abastecimentoRepository.deleteById(id);
        }
    }

    private boolean abastecimentoIsEmpity(Long id){
        Optional<Abastecimento> isEmpity = abastecimentoRepository.findById(id);
        if (isEmpity.isPresent()) {
            return true;
        }
        return false;
    }
    
}
