package org.example.projetospringdata.service;

import org.example.projetospringdata.domain.Professor;
import org.example.projetospringdata.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public Professor salvar(Professor professor) {return repository.save(professor);}
    public List<Professor> listar() {
        return repository.findAll();
    }
    public Professor buscar(Long id) {
        return repository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("Professor nao encontrado para o id: " + id));
    }
    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
