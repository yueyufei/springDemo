package com.golaxy.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.golaxy.model.Books;
import com.golaxy.service.ElasticSearchService;


@RestController
public class BooksController {
    @Autowired
    private ElasticSearchService elasticSearchService;

    @GetMapping(value = "/books/books")
    public List<Books> findByName(@RequestParam(value = "title") String title,
            @RequestParam(value = "start", defaultValue = "1") Integer start,
            @RequestParam(value = "size", defaultValue = "10") Integer size) {
        List<Books> books = elasticSearchService.getLawData(title, start - 1, size);
        return books;
    }

}
