package com.learn.jpa.models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Embeddable
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Address {
    private String street;
    private String city;
    private String state;
}
