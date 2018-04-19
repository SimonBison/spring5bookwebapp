package com.gmail.spbisoft.spring5bookwebapp.repositories;

import com.gmail.spbisoft.spring5bookwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
