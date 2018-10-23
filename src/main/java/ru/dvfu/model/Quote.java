package ru.dvfu.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "quotes")
public class Quote {

    @Id
    private String id;

    private String body;

    public Quote(String body) {
        this.body = body;
    }

}
