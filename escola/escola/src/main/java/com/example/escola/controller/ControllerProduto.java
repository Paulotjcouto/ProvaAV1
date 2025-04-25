package com.example.escola.controller;

import com.example.escola.model.Produto;
import com.example.escola.service.ServiceProduto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ControllerProduto {

    private final ServiceProduto manipuladorProduto;

    public ControllerProduto(ServiceProduto manipuladorProduto) {
        this.manipuladorProduto = manipuladorProduto;
    }

    @GetMapping
    public List<Produto> buscarProdutos() {
        return manipuladorProduto.obterTodos();
    }

    @PostMapping
    public Produto inserir(@RequestBody Produto itemProduto) {
        return manipuladorProduto.salvar(itemProduto);
    }

    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable Long codigo) {
        manipuladorProduto.deletar(codigo);
    }
}
