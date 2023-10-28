package mtech.service.controller;

import feign.Param;
import jakarta.persistence.Id;
import mtech.service.datasource.model.Tecnico;
import mtech.service.repository.TecnicoRepository;
import org.hibernate.mapping.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
// ... outras importações ...

@RestController
@RequestMapping("/api")
public class TecnicoController {
@Autowired
    private TecnicoRepository tecnicoRepository;
    private Tecnico tecnico;

    // ... outros endpoints ...

    // Endpoint para excluir um técnico por ID
    @DeleteMapping("/tecnicos/{id}")
    public ResponseEntity<?> excluirTecnicoPorId(@PathVariable Long id) {
        Optional<Tecnico> tecnicoOptional = tecnicoRepository.findById(id);

        if (tecnicoOptional.isPresent()) {
            tecnicoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping(value = "/tecnicos")
    public ResponseEntity<List<Tecnico>> buscarTodosTecnicos() {
        List<Tecnico> listaTecnicos = tecnicoRepository.findAll();
        return ResponseEntity.ok(listaTecnicos);

    }
    @GetMapping("tecnicos/{id}")
    public ResponseEntity<Tecnico> buscarTecnicoPorId(@PathVariable Long id) {
        Optional<Tecnico> tecnicoOptional = tecnicoRepository.findById(id);

        if (tecnicoOptional.isPresent()) {
            Tecnico tecnico = tecnicoOptional.get();
            return ResponseEntity.ok(tecnico);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // Endpoint para atualizar o nome e a data de aniversário de um técnico por ID
    @PatchMapping("/tecnicos/{id}")
    public ResponseEntity<Tecnico> atualizarTecnicoPorId(
            @PathVariable Long id,
            @RequestParam(value = "nome") String novoNome,
            @RequestParam(value = "dataAniversario") LocalDate novaDataAniversario) {
        Optional<Tecnico> tecnicoOptional = tecnicoRepository.findById(id);

        if (tecnicoOptional.isPresent()) {
            Tecnico tecnico = tecnicoOptional.get();
            tecnico.setNome(novoNome);
            tecnico.setIdade(String.valueOf(novaDataAniversario));

            Tecnico tecnicoAtualizado = tecnicoRepository.save(tecnico);
            return ResponseEntity.ok(tecnicoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
