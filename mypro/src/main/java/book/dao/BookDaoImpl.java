package book.dao;

import book.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by THZ on 2016/12/26.
 */
@Repository
@Scope("prototype")
public class BookDaoImpl implements BookDao {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    public List getAllList() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Book");
        List allList = query.getResultList();
        return allList;
    }

    public List getOneList(Integer count) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Book where bookCount=:mycount");
        query.setParameter("mycount",count);
        List list = query.getResultList();
        return list;
    }

    public List getRevList(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Book where bookId=:myid");
        query.setParameter("myid",id);
        List list = query.getResultList();
        return list;
    }

    public String addList(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.save(book);
        return "ok";
    }

    public void deleList(Integer[] id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Book where id=:myid");
        for(int mid : id ){
            query.setParameter("myid",mid);
            if(query.getResultList().size()>0){
                Book book = (Book) query.getResultList().get(0);
                session.delete(book);
            }
        }
    }

    public String revList(Book book,Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Book books = session.get(Book.class,id);
        books.setBookCount(book.getBookCount());
        books.setBookName(book.getBookName());
        books.setBookClass(book.getBookClass());
        books.setBookIntr(book.getBookIntr());
        books.setTime(book.getTime());
        books.setMoney(book.getMoney());
        session.update(books);
        return "ok";
    }
}
