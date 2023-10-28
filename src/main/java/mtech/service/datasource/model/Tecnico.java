package mtech.service.datasource.model;

import jakarta.persistence.*;
import mtech.service.enummeration.Status;

import java.io.Serializable;
import java.time.LocalDate;
@Entity
@Table(name ="tecnico")
public class Tecnico implements Serializable {
    private static final long serialVersionUID = -4311574801152044258L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Tecnico() {

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

    public void setIdade(String idade) {
        this.idade = LocalDate.parse(idade);
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
