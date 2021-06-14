package com.denis.bookstore;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/address")
public class AddressController {

    public static ArrayList<Address> addressesList = new ArrayList<>();

    @PostMapping
    public void newAddress(
            @RequestBody Address address
    ) {
        addressesList.add(address);
    }

    @DeleteMapping
    public void removeAddress(
            @RequestParam String addressId
    ) {
        addressesList.removeIf(address -> address.getAddressId().equalsIgnoreCase(addressId));
    }
}
