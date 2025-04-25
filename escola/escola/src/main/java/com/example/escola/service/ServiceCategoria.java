package com.example.escola.service;

import com.example.escola.model.Categoria;
import com.example.escola.repository.RepositoryCategoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategoria {

    private final RepositoryCategoria repositorio;

    public ServiceCategoria(RepositoryCategoria repositorio) {
        this.repositorio = repositorio;
    }

    public List<Categoria> obterTodas() {
        return repositorio.findAll();
    }

    public Categoria salvar(Categoria nova) {
        return repositorio.save(nova);
    }

    public void deletar(Long chave) {
        repositorio.deleteById(chave);
    }
}
