package com.denis.livraria;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static com.denis.livraria.EnderecoController.listaEnderecos;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    public static ArrayList<Cliente> listaClientes = new ArrayList<>();


    @PostMapping(value = "/cadastrarCliente")
    public void cadastrarCliente(
            @RequestBody Cliente cliente
    ) {
        listaClientes.add(cliente);
    }

    @GetMapping(value = "/listagemClientes")
    public ArrayList<Cliente> listagemClientes() {
        return listaClientes;
    }

    @DeleteMapping(value = "/removerCliente")
    public void removerCliente(
            @RequestParam String nome
    ) {
        listaClientes.removeIf(cliente -> cliente.getNome().equalsIgnoreCase(nome));
    }

    @GetMapping(value = "/atribuirEndereco")
    public void atribuirEndereco(
            @RequestParam String identificadorEndereco
    ) {
        for (Endereco endereco : listaEnderecos) {
            if (endereco.getIdentificadorEndereco().equalsIgnoreCase(identificadorEndereco)) {
                for(Cliente cliente : listaClientes){
                    if(cliente.getNome().equalsIgnoreCase(identificadorEndereco)){
                        cliente.setEndereco(endereco);
                    }
                }
            }
        }
    }
}
