package com.xtyuns.controller;

import com.xtyuns.pojo.Book;
import com.xtyuns.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/getBookCount.do")
    public String getBookCount() {
        return bookService.findBookCount().toString();
    }

    @RequestMapping("/getAllBook.do")
    public String getAllBook() {
        return bookService.findAllBook().toString();
    }

    @RequestMapping("/addBook.do")
    public String addBook(Book book) {
        return bookService.saveBook(book).toString();
    }

    @RequestMapping("/cutBook.do")
    public String cutBook(String id) {
        return bookService.removeBookById(id).toString();
    }

    @RequestMapping("/editBook")
    public String editBook(Book book) {
        return bookService.modifyBookById(book).toString();
    }
}
