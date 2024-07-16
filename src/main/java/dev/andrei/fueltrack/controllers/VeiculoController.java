package dev.andrei.fueltrack.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.andrei.fueltrack.client.FipeAPIClient;
import dev.andrei.fueltrack.dto.AnoDTO;
import dev.andrei.fueltrack.dto.FichaCompletaDTO;
import dev.andrei.fueltrack.dto.MarcaDTO;
import dev.andrei.fueltrack.dto.ModelosDTO;

@RestController
@RequestMapping("veiculos")
public class VeiculoController {

    @Autowired
    private FipeAPIClient veiculoService;

    @GetMapping("marcas")
    public List<MarcaDTO> listarMarcas(@RequestParam String tipo){
       List<MarcaDTO> listaMarcasPorTipo = veiculoService.listarMarcas(tipo);
       return listaMarcasPorTipo;
    }

    @GetMapping("modelos")
    public ModelosDTO listarModelos(@RequestParam String tipo,@RequestParam Long codMarca){
        ModelosDTO listaModelosPorMarca = veiculoService.listarModelosMarcas(tipo, codMarca);
        return listaModelosPorMarca;
    }

    @GetMapping("anos")
    public List<AnoDTO> listarAnosModelo(@RequestParam String tipo, @RequestParam Long codMarca, @RequestParam Long codModelo){
        List<AnoDTO> listarAnos = veiculoService.listarAnosModelo(tipo, codMarca, codModelo);
        return listarAnos;
    }

    @GetMapping("ficha")
        public FichaCompletaDTO fichaCompleta(@RequestParam String tipo,  @RequestParam Long codMarca, @RequestParam Long codModelo, @RequestParam String anoModelo){
            FichaCompletaDTO fichaVeiculo = veiculoService.fichaCompleta(tipo, codMarca, codModelo, anoModelo);
            return fichaVeiculo;
        }
}
