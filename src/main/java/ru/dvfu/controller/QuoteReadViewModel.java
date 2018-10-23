package ru.dvfu.controller;

import lombok.Data;
import ru.dvfu.model.Quote;

@Data
public class QuoteReadViewModel {

    private String body;

    public Quote apply(Quote quote) {
        quote.setBody(this.body);
        return quote;
    }

    public Quote newFromModel() {
        return new Quote(this.body);
    }

}
