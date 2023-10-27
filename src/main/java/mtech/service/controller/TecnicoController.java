package mtech.service.controller;

import mtech.service.datasource.model.Tecnico;
import mtech.service.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TecnicoController {
    @Autowired
    private TecnicoRepository tecnicoRepository;

    @GetMapping(path = "api/tecnico/id/{}")
    public ResponseEntity<Optional<Tecnico>> buscarTecnicoPorId(@PathVariable(name = "id", required = true) Long idTecnico) {
        return ResponseEntity.ok(tecnicoRepository.findById(idTecnico));
    }
}
