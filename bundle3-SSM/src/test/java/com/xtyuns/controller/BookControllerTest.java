package com.xtyuns.controller;

import com.xtyuns.pojo.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;


class BookControllerTest {
    static BookController bookController;

    @BeforeAll
    static void init() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        bookController = ctx.getBean(BookController.class);
    }

    @Test
    void getBookCount() {
        String bookCount = bookController.getBookCount();
        System.out.println(bookCount);
    }

    @Test
    void getAllBook() {
        String allBook = bookController.getAllBook();
        System.out.println(allBook);
    }

    @Test
    void addBookSuccess() {
        Book book = new Book();
        book.setbName(UUID.randomUUID().toString().substring(19));
        String s = bookController.addBook(book);
        Assertions.assertEquals("true", s);
    }

    @Test
    void addBookFail() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("false", bookController.addBook(new Book())),
                () -> Assertions.assertEquals("false", bookController.addBook(null))
        );
    }

    @Test
    void cutBook() {
        String s = bookController.cutBook("3");
        System.out.println(s);
        Assertions.assertEquals("true", s);
    }

    @Test
    void editBookSuccess() {
        Book book = new Book();
        book.setId(2);
        book.setbName(UUID.randomUUID().toString().substring(19));
        String s = bookController.editBook(book);
        Assertions.assertEquals("true", s);
    }

    @Test
    void editBookFail() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("false", bookController.editBook(new Book())),
                () -> Assertions.assertEquals("false", bookController.editBook(null))
        );
    }
}