package ru.dvfu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.dvfu.model.Quote;

@Repository
public interface QuotesRepository extends MongoRepository<Quote, String> {
}
