package com.example.escola.service;

import com.example.escola.model.Produto;
import com.example.escola.repository.RepositoryProduto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduto {

    private final RepositoryProduto daoProduto;

    public ServiceProduto(RepositoryProduto daoProduto) {
        this.daoProduto = daoProduto;
    }

    public List<Produto> obterTodos() {
        return daoProduto.findAll();
    }

    public Produto salvar(Produto novoProduto) {
        return daoProduto.save(novoProduto);
    }

    public void deletar(Long identificador) {
        daoProduto.deleteById(identificador);
    }
}
