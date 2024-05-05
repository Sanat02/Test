package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@NamedStoredProcedureQuery(
        name="getAllBookss",
        procedureName = "get_all_books",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.OUT,name = "books",type= Book.class)
        }
)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private int price;
}
