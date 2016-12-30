package book.service;

import book.dao.BookDao;
import book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by THZ on 2016/12/26.
 */
@Transactional
@Service
@Scope("prototype")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bd;

    public List getAllList() {
        return bd.getAllList();
    }

    public List getOneList(Integer id) {
        return bd.getOneList(id);
    }

    public List getRevList(Integer id) {
        return bd.getRevList(id);
    }

    public String addList(Book book) {
        return bd.addList(book);
    }

    public void deleList(Integer[] id) {
        bd.deleList(id);
    }

    public String revList(Book book, Integer id) {
        return bd.revList(book, id);
    }
}
