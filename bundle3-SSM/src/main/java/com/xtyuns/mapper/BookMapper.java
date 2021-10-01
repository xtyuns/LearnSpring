package com.xtyuns.mapper;

import com.xtyuns.pojo.Book;

import java.util.List;

public interface BookMapper {
    Integer selectBookCount();

    List<Book> selectAllBook();

    /**
     * @param book required Field: bName
     * @return 返回数据插入结果
     */
    Boolean insertBook(Book book);

    Boolean deleteBookById(int id);

    /**
     * @param newInfo required Field: id
     * @return 返回数据更新结果
     */
    Boolean updateBookById(Book newInfo);
}




