package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/first")
    public List<Book> getAllBooks1(Authentication auth) {
        return bookService.firstMethod();
    }
    @GetMapping("/second")
    public List<Book> getAllBooks2(Authentication auth) {
        return bookService.secondMethod();
    }
    @GetMapping("/third")
    public List<Book> getAllBooks3(Authentication auth) {
        return bookService.thirdMethod();
    }
    @GetMapping("/fourth")
    public List<Book> getAllBooks4(Authentication auth) {
        return bookService.fourthMethod();
    }
}
