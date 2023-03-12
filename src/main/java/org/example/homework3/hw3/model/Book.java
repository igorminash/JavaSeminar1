package org.example.homework3.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
@Data
@AllArgsConstructor
public class Book {
    private String name;
    private String surname;
    private Integer price;
    private Integer year;
    private Integer page;

}
