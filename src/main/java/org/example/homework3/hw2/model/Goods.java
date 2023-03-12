package org.example.homework3.hw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */

@Data
@AllArgsConstructor
public class Goods {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer sort;

}
