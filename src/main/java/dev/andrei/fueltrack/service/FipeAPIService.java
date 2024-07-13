package dev.andrei.fueltrack.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "fipeapi", url = "https://parallelum.com.br/fipe/api/v1")
public interface FipeAPIService {

    @GetMapping(value = "/{tipo}/marcas", produces = "application/json")
    String consultarMarcas(@PathVariable("tipo") String tipo);

    @GetMapping(value = "/{tipo}/marcas/{codMarca}/modelos")
    String conultarModelosMarcas(@PathVariable("tipo") String tipo, @PathVariable("codMarca") Long codMarca);
}
