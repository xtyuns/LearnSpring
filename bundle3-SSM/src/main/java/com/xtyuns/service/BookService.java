package com.xtyuns.service;

import com.xtyuns.pojo.Book;

import java.util.List;


public interface BookService {
    Integer findBookCount();

    List<Book> findAllBook();

    Boolean saveBook(Book bookInfo);

    Boolean removeBookById(String id);

    Boolean modifyBookById(Book newInfo);
}
