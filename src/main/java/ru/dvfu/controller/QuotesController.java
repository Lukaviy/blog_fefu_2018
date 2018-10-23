package ru.dvfu.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dvfu.model.Quote;
import ru.dvfu.service.QuoteService;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor_={@Autowired})
public class QuotesController {

    QuoteService quoteService;

    @GetMapping("/quotes")
    public List<Quote> getQuotes() {
        return quoteService.getQuotes();
    }

    @GetMapping("/quotes/{id}")
    public Quote getQuote(@PathVariable("id") String id) {
        return quoteService.findById(id);
    }

    @PostMapping("/quotes")
    public void createQuote(@RequestBody QuoteReadViewModel quote) {
        quoteService.createQuote(quote);
    }

}
