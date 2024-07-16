package dev.andrei.fueltrack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.andrei.fueltrack.model.Abastecimento;
import dev.andrei.fueltrack.service.IAbastecimentoService;

@RestController
@RequestMapping("abastecimentos")
public class AbastecimentoController {

    @Autowired
    private IAbastecimentoService abastecimentoService;

    @GetMapping
    public ResponseEntity<Iterable<Abastecimento>> buscarTodos() {
        return ResponseEntity.ok(abastecimentoService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Abastecimento> inserir(@RequestBody Abastecimento abastecimento) {
        abastecimentoService.inserir(abastecimento);
        return ResponseEntity.ok(abastecimento);
    }

    @PutMapping
    public ResponseEntity<Abastecimento> atualizar(@RequestBody Long id, @RequestBody Abastecimento abastecimento){
        abastecimentoService.atualizar(id, abastecimento);
        return ResponseEntity.ok(abastecimento);
    }

    @DeleteMapping
    public void deletar(@RequestBody Long id){
        abastecimentoService.excluir(id);
    }

}
