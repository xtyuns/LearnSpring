package com.xtyuns.service.impl;

import com.xtyuns.mapper.BookMapper;
import com.xtyuns.pojo.Book;
import com.xtyuns.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    @Override
    public Integer findBookCount() {
        return bookMapper.selectBookCount();
    }

    @Override
    public List<Book> findAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    @Transactional
    public Boolean saveBook(Book bookInfo) {
        if (bookInfo == null || bookInfo.getbName() == null) return false;
        return bookMapper.insertBook(bookInfo);
    }

    @Override
    @Transactional
    public Boolean removeBookById(String id) {
        int bid = Integer.parseInt(id);
        return bookMapper.deleteBookById(bid);
    }

    @Override
    @Transactional
    public Boolean modifyBookById(Book newInfo) {
        if (newInfo == null || newInfo.getId() == null) return false;
        return bookMapper.updateBookById(newInfo);
    }
}
