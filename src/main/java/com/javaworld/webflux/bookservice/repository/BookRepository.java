package com.javaworld.webflux.bookservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.javaworld.webflux.bookservice.model.Book;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {

}
