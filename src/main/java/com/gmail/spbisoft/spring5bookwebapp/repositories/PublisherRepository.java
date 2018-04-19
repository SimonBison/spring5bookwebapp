package com.gmail.spbisoft.spring5bookwebapp.repositories;

import com.gmail.spbisoft.spring5bookwebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
