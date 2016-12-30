package book.service;

import book.entity.Book;

import java.util.List;

/**
 * Created by THZ on 2016/12/26.
 */
public interface BookService {
    public List getAllList();
    public List getOneList(Integer id);
    public List getRevList(Integer id);
    public String addList(Book book);
    public void deleList(Integer[] id);
    public String revList(Book book, Integer id);
}
