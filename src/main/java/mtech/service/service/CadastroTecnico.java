package mtech.service.service;

import mtech.service.datasource.model.Tecnico;
import mtech.service.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


public class CadastroTecnico {
    @Autowired
    TecnicoRepository tecnicoRepository;

    public void cadastro(Tecnico tecnico){
        tecnicoRepository.saveAndFlush(tecnico);
    }

}
