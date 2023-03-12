package org.example.homework3.hw3;

import org.example.homework3.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Ex3 {
    public static void main(String[] args) {
        Book book1 = new Book("Красная таблетка", "Курпатов", 1200, 2021, 343);
        Book book2 = new Book("Думай как математик", "Оакли", 1500, 2022, 283);
        Book book3 = new Book("Мастер и Маргарита", "Булгаков", 1000, 1966, 480);
        Book book4 = new Book("Война и Мир", "Толстой", 2000, 1869, 1300);
        Book book5 = new Book("Преступление и наказание", "Достоевский", 1700, 1866, 608);
        Book book6 = new Book("Близко к сердцу", "Санд", 800, 2020, 163);

        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

        List<String> bookName = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getSurname().contains("а") && book.getYear() >= 2010 && SimpleNum(book.getPage())) {
                bookName.add(book.getName());
            }
        }
        System.out.println(bookName);
    }

    /**
     * @param page кол-во страниц в книге
     * @return простое число или нет
     */
    public static boolean SimpleNum(Integer page) {
        for (int i = 2; i <= Math.sqrt(page); i++) {
            if (page % i == 0) {
                return false;
            }
        }
        return true;
    }
}
