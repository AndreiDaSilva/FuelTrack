package dev.andrei.fueltrack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.andrei.fueltrack.service.FipeAPIService;

@RestController
@RequestMapping("veiculos")
public class VeiculoController {
    @Autowired
    private FipeAPIService veiculoService;

    @GetMapping("tipos")
    public String buscarPorTipo(@RequestParam String tipo){
       String listaMarcasPorTipo = veiculoService.consultarMarcas(tipo);
       return listaMarcasPorTipo;
    }

    @GetMapping("/{tipo}/marcas/{codMarca}/modelos")
    public String buscarModelosPorMarca(@PathVariable String tipo,@PathVariable Long codMarca){
        String listaModelosPorMarca = veiculoService.conultarModelosMarcas(tipo, codMarca);
        return listaModelosPorMarca;
    }
}
