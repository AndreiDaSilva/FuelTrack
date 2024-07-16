package dev.andrei.fueltrack.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dev.andrei.fueltrack.dto.AnoDTO;
import dev.andrei.fueltrack.dto.FichaCompletaDTO;
import dev.andrei.fueltrack.dto.MarcaDTO;
import dev.andrei.fueltrack.dto.ModelosDTO;

@FeignClient(name = "fipeapi", url = "https://parallelum.com.br/fipe/api/v1")
public interface FipeAPIClient {

    @GetMapping(value = "/{tipo}/marcas", produces = "application/json")
    List<MarcaDTO> listarMarcas(@PathVariable("tipo") String tipo);

    @GetMapping(value = "/{tipo}/marcas/{codMarca}/modelos", produces = "application/json")
    ModelosDTO listarModelosMarcas(@PathVariable("tipo") String tipo, @PathVariable("codMarca") Long codMarca);

    @GetMapping(value = "/{tipo}/marcas/{codMarca}/modelos/{codModelo}/anos/", produces = "application/json")
    List<AnoDTO> listarAnosModelo(@PathVariable("tipo") String tipo, @PathVariable("codMarca") Long codMarca,
            @PathVariable("codModelo") Long codModelo);

    @GetMapping(value = "/{tipo}/marcas/{codMarca}/modelos/{codModelo}/anos/{anoModelo}", produces = "application/json")
    FichaCompletaDTO fichaCompleta(@PathVariable("tipo") String tipo, @PathVariable("codMarca") Long codMarca,
            @PathVariable("codModelo") Long codModelo, @PathVariable("anoModelo") String anoModelo);

}
