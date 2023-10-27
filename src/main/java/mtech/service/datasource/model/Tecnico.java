package mtech.service.datasource.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import mtech.service.enummeration.Status;

import java.time.LocalDate;
@Entity
public class Tecnico {
    @Id
    private Long id;
    private String nome;
    private LocalDate idade;
    @Column(name = "Ordem_Serviço")
    private String ordemServico;
    @Column(name = "Id_Cliente")
    private Long idCliente;
    @Enumerated
    private Status  status = Status.PROCESSANDO;

    public Tecnico(String nome, LocalDate idade, String codigoResgistro, Long idCliente) {
        this.nome = nome;
        this.idade = idade;
        this.ordemServico = codigoResgistro;
        this.idCliente = idCliente;
    }

    @SuppressWarnings("unused")
    private Tecnico() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getCodigoResgistro() {
        return ordemServico;
    }

    public void setCodigoResgistro(String codigoResgistro) {
        this.ordemServico = codigoResgistro;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
