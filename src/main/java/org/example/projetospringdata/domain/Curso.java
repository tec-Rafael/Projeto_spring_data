package org.example.projetospringdata.domain;

import jakarta.persistence.*;
import org.hibernate.sql.results.graph.embeddable.AggregateEmbeddableResultGraphNode;

@Entity
@Table(name = "Cursos")

public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String categoria;
    private int cargaHoraria;
    private boolean concluido;
    double notafinal;
    private int quantidadeliberada;

    protected Curso(){
    }

    public Curso(String nome, String categoria, int cargaHoraria){
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
        this.concluido = false;
        this.notafinal = 0.0;
        this.quantidadeliberada = 0;

    }


}