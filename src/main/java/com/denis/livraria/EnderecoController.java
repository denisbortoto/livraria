package com.denis.livraria;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    public static ArrayList<Endereco> listaEnderecos = new ArrayList<>();

    @PostMapping(value = "/novoEndereco")
    public void novoEndereco(
            @RequestBody Endereco endereco
    ) {
        listaEnderecos.add(endereco);
    }

    @DeleteMapping(value = "/removerEndereco")
    public void removerEndereco(
            @RequestParam String identificadorEndereco
    ) {
        listaEnderecos.removeIf(endereco -> endereco.getIdentificadorEndereco().equalsIgnoreCase(identificadorEndereco));
    }
}
