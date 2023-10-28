package mtech.service.controller;

import mtech.service.enummeration.Status;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * DTO for {@link mtech.service.datasource.model.Tecnico}
 */
public class TecnicoPorId implements Serializable {
    private final Long id;
    private final String nome;
    private final LocalDate idade;
    private final Status status;

    public TecnicoPorId(Long id, String nome, LocalDate idade, Status status) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TecnicoPorId entity = (TecnicoPorId) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.nome, entity.nome) &&
                Objects.equals(this.idade, entity.idade) &&
                Objects.equals(this.status, entity.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idade, status);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nome = " + nome + ", " +
                "idade = " + idade + ", " +
                "status = " + status + ")";
    }
}