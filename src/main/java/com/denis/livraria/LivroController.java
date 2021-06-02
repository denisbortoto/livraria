package com.denis.livraria;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/livros")
public class LivroController {

    public static ArrayList<Livro> listaLivros = new ArrayList<>();

    @PostMapping
    public void adcionarLivros(
            @RequestBody Livro livro
    ) {
        listaLivros.add(livro);
    }

    @GetMapping(value = "/listagemLivros")
    public ArrayList<Livro> listagemlivros() {
        return listaLivros;
    }

    @GetMapping(value = "/buscaLivro")
    public Livro pesquisar(
            @RequestParam String nome
    ) {
        for (Livro livro : listaLivros) {
            if (livro.getNome().equalsIgnoreCase(nome)) {
                return livro;
            }
        }
        return null;
    }

    @DeleteMapping(value = "/removerLivro")
    public void removerLivro(
            @RequestParam String codigo
    ) {
        listaLivros.removeIf(livro -> livro.getCodigo().equalsIgnoreCase(codigo));
    }


}
