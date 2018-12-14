package com.golaxy.dao;

import java.util.List;

import com.golaxy.model.Books;


public interface ElasticSearchDao {

    List<Books> getLawData(String name, Integer start, Integer size);

}
