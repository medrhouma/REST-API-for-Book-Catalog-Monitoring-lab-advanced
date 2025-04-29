package com.example.bookcatalog.repository;

import com.example.bookcatalog.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    Book save(Book book);

    void delete(Long id);

    boolean existsById(Long id);
}