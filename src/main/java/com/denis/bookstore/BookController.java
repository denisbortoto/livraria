package com.denis.bookstore;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/books")
public class BookController {

    public static ArrayList<Book> booksList = new ArrayList<>();

    @PostMapping
    public void addBooks(
            @RequestBody Book book
    ) {
        booksList.add(book);
    }

    @GetMapping(value = "/booksList")
    public ArrayList<Book> booksList() {
        return booksList;
    }

    @GetMapping(value = "/searchBook")
    public Book pesquisar(
            @RequestParam String name
    ) {
        for (Book book : booksList) {
            if (book.getName().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    @DeleteMapping
    public void removerLivro(
            @RequestParam String bookId
    ) {
        booksList.removeIf(book -> book.getId().equalsIgnoreCase(bookId));
    }


}
