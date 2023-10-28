package mtech.service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Tecnicos API", description = "Informaçao de controle de Tecnicos e ordem de Serviços"))
public class MtechAssistenciaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MtechAssistenciaApplication.class, args);
    }

}
