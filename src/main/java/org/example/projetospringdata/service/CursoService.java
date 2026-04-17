package org.example.projetospringdata.service;

import org.example.projetospringdata.domain.Curso;
import org.example.projetospringdata.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository repository;

    public CursoService(CursoRepository repository) {
        this.repository = repository;
    }
    public Curso salvar(Curso curso) {
        return repository.save(curso);
    }

    public List<Curso> listar() {
        return repository.findAll();
    }

    public Curso buscar(Long id) {
        return repository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("Curso nao encontrado para o id: " + id));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
