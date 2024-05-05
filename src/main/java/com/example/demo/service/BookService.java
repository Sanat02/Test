package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public List<Book> firstMethod(){
        return bookRepository.get_all_books();
    }

    @Transactional
    public List<Book> secondMethod(){
        return bookRepository.getAllBooks();
    }

    public List<Book> fourthMethod(){
        return bookRepository.secondMethodName();
    }
}
