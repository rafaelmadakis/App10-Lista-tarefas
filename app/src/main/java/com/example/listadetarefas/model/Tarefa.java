package com.example.listadetarefas.model;

import java.io.Serializable;
import java.util.Objects;

/*Created by Rafael Madakis */
public class Tarefa implements Serializable {

    private Long id;
    private String nomeTarefa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return id.equals(tarefa.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
