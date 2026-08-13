package co.edu.sena.inventario.controller;

import co.edu.sena.inventario.model.Municipio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MunicipioController {

    private final List<Municipio> municipios = List.of(
        new Municipio(1L, "Madrid", "Cundinamarca"),
        new Municipio(2L, "Mosquera", "Cundinamarca"),
        new Municipio(3L, "Facatativa", "Cundinamarca")
    );

    @GetMapping("/municipios")
    public List<Municipio> listarMunicipios() {
        return municipios;
    }

    @GetMapping("/municipios/{id}")
    public Municipio buscarMunicipio(@PathVariable Long id) {

        for (Municipio municipio : municipios) {
            if (municipio.getId().equals(id)) {
                return municipio;
            }
        }

        return null;
    }
}