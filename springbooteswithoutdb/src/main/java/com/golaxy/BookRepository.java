package com.golaxy;

import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.action.get.GetRequestBuilder;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
//
//import com.golaxy.model.Book;
//
//public interface BookRepository extends ElasticsearchRepository<Book, String>{
//    Page<Book> findByAuthor(String author, PageRequest pageRequest);
//    List<Book> findByTitle(String title);
//    @SuppressWarnings("unchecked")
//	Book save(Book book);
//
//}
@Repository
public class BookRepository{
	
	@Autowired
	TransportClient client;
	public String find(){
		GetResponse get = client.prepareGet("test", "document", "054204254530552803").get();
		String index = get.getIndex();
		System.out.println(index);
		return index;
	}
}
