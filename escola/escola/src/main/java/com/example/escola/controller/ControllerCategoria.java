package com.example.escola.controller;

import com.example.escola.model.Categoria;
import com.example.escola.service.ServiceCategoria;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class ControllerCategoria {

    private final ServiceCategoria manipuladorCategoria;

    public ControllerCategoria(ServiceCategoria manipuladorCategoria) {
        this.manipuladorCategoria = manipuladorCategoria;
    }

    @GetMapping
    public List<Categoria> listarCategorias() {
        return manipuladorCategoria.obterTodas();
    }

    @PostMapping
    public Categoria registrarCategoria(@RequestBody Categoria categoriaNova) {
        return manipuladorCategoria.salvar(categoriaNova);
    }

    @DeleteMapping("/{identificador}")
    public void apagarCategoria(@PathVariable Long identificador) {
        manipuladorCategoria.deletar(identificador);
    }
}
