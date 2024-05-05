package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    //use procedure name as the method name
    @Procedure
    List<Book> get_all_books();


    //use @Procedure with different method name.
    //use attributes to pass procedureName
    @Procedure(procedureName = " get_all_books")
    List<Book> getAllBooks();

    //Using @NamedStoredProcedureQuery annotation
    @Procedure(name="getAllBookss")
    List<Book> anyMethodName();

    //Using @Query annotation
    @Query(value = "call get_all_books()",nativeQuery = true)
    List<Book> secondMethodName();

}
