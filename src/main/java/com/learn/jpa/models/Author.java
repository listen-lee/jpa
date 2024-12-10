package com.learn.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Author extends BaseEntity {

    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

    @Embedded
    private Address address;
}
