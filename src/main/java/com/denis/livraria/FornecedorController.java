package com.denis.livraria;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    public static ArrayList<Fornecedor> listaFornecedores = new ArrayList<>();

    @PostMapping(value = "/adcionarFornecedor")
    public void adcionarfornecedor(
            @RequestBody Fornecedor fornecedor
    ) {
        listaFornecedores.add(fornecedor);
    }

    @GetMapping(value = "/listagemFornecedores")
    public ArrayList<Fornecedor> listagemFornecedores() {
        return listaFornecedores;
    }

    @DeleteMapping(value = "/removerFornecedor")
    public void removerFornecedor(
            @RequestParam String nome
    ) {
        listaFornecedores.removeIf(fornecedor -> fornecedor.getNome().equalsIgnoreCase(nome));
    }

}
