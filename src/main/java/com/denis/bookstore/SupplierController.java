package com.denis.bookstore;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    public static ArrayList<Supplier> suppliersList = new ArrayList<>();

    @PostMapping
    public void addSupplier(
            @RequestBody Supplier supplier
    ) {
        suppliersList.add(supplier);
    }

    @GetMapping
    public ArrayList<Supplier> suppliersList() {
        return suppliersList;
    }

    @DeleteMapping
    public void removeSupplier(
            @RequestParam String nome
    ) {
        suppliersList.removeIf(supplier -> supplier.getName().equalsIgnoreCase(nome));
    }
}
