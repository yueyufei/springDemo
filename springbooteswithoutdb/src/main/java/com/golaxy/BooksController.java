package com.golaxy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BooksController {
    @Autowired
    private BookService service;

    @GetMapping(value = "/books/books")
    public String findByName() {
        return service.find();
    }

}
