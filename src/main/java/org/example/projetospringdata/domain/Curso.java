package org.example.projetospringdata.domain;

import jakarta.persistence.*;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    private String nome_curso ;
    private int duracao_curso_ano;

}
