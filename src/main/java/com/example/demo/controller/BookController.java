package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<String> books = new ArrayList<>();

    @PostMapping
    public String addBook(@RequestBody String book) {
        books.add(book);
        return "Book added!";
    }

    @GetMapping
    public List<String> getBooks() {
        return books;
    }
}