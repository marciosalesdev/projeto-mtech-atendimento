package mtech.service.repository;

import mtech.service.datasource.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends
        JpaRepository <Tecnico, Long >{
}
