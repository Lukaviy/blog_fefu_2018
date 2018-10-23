package ru.dvfu.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dvfu.controller.QuoteReadViewModel;
import ru.dvfu.model.Quote;
import ru.dvfu.repository.QuotesRepository;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor_={@Autowired})
public class QuoteService {

    QuotesRepository quotesRepository;

    public List<Quote> getQuotes() {
        return quotesRepository.findAll();
    }

    public Quote findById(String id) {
        return quotesRepository.findById(id).orElseThrow(() -> new RuntimeException("asdad"));
    }

    public void createQuote(QuoteReadViewModel quoteReadViewModel) {
        quotesRepository.save(quoteReadViewModel.newFromModel());
    }

}
