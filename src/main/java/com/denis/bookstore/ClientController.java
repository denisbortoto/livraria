package com.denis.bookstore;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static com.denis.bookstore.AddressController.addressesList;

@RestController
@RequestMapping("/client")
public class ClientController {

    public static ArrayList<Client> clientsList = new ArrayList<>();

    @PostMapping(value = "/addClient")
    public void addClient(
            @RequestBody Client client
    ) {
        clientsList.add(client);
    }

    @GetMapping
    public ArrayList<Client> clientsList() {
        return clientsList;
    }

    @DeleteMapping(value = "/removeClient")
    public void removeClient(
            @RequestParam String name
    ) {
        clientsList.removeIf(client -> client.getName().equalsIgnoreCase(name));
    }

    @GetMapping(value = "/addressRegister")
    public void addressRegister(
            @RequestParam String addressId
    ) {
        for (Address address : addressesList) {
            if (address.getAddressId().equalsIgnoreCase(addressId)) {
                for(Client client : clientsList){
                    if(client.getName().equalsIgnoreCase(addressId)){
                        client.setEndereco(address);
                    }
                }
            }
        }
    }
}
