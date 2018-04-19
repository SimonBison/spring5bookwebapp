package com.gmail.spbisoft.spring5bookwebapp.repositories;

import com.gmail.spbisoft.spring5bookwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
