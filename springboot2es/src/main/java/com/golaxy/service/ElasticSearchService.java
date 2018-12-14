package com.golaxy.service;

import java.util.List;

import com.golaxy.model.Books;

public interface ElasticSearchService {

    public List<Books> getLawData(String name, Integer start, Integer size);

}
