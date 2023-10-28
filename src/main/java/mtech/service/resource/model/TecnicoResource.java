package mtech.service.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TecnicoResource {

    @JsonProperty("nome_tecnico")
    private String nome;
    @JsonProperty("id_cliente")
    private String idCliente;
    @JsonProperty("ordem_de_serviço")
    private String ordemServico;

    public TecnicoResource(String ordemServico) {
        this.ordemServico = ordemServico;
    }

    public TecnicoResource(String nome, String idCliente) {
        this.nome = nome;
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(String ordemServico) {
        this.ordemServico = ordemServico;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}
