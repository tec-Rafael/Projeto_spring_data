package org.example.projetospringdata.Controller;

import org.example.projetospringdata.domain.Professor;
import org.example.projetospringdata.service.ProfessorService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping()

public class ProfessorRestController {

    private final ProfessorService service;

    public ProfessorRestController(ProfessorService service) {
        this.service = service;
    }

    @PostMapping
    public Professor criar(@RequestBody Professor professor) {
        return service.salvar(professor);
    }

    @GetMapping
    public List<Professor> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Professor buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

}
