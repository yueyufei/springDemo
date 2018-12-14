package com.golaxy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public String find() {
		return bookRepository.find();
	}
//
//
//    @Override
//    public Book save(Book book) {
//        return bookRepository.save(book);
//    }
//
//    @Override
//    public void delete(Book book) {
//        bookRepository.delete(book);
//    }
//
//    @Override
//    public Book findOne(String id) {
//        return bookRepository.findOne(id);
//    }
//
//    @Override
//    public Iterable<Book> findAll() {
//        return bookRepository.findAll();
//    }
//
//    @Override
//    public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
//        return bookRepository.findByAuthor(author, pageRequest);
//    }
//
//    @Override
//    public List<Book> findByTitle(String title) {
//        return bookRepository.findByTitle(title);
//    }

}
