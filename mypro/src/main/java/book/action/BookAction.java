package book.action;

import book.entity.Book;
import book.service.BookService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by THZ on 2016/12/26.
 */
@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class BookAction extends ActionSupport implements ModelDriven<Book> {

    @Autowired
    private BookService bs;

    private List list;
    public List getList(){
        return list;
    }

    private Integer id;
    public void setId(Integer id){ this.id = id;}
    private Integer count;
    public void setCount(Integer count){ this.count = count;}

    private Integer[] bookIds;
    public void setBookIds(Integer[] bookIds){
        this.bookIds = bookIds;
    }

    private Book book;
    public void setBook(Book book){
        this.book = book;
    }

    public String getAllList(){
        list = bs.getAllList();
        return "index";
    }
    public String getOneList(){
        list = bs.getOneList(count);
        if(list.size()>0){
            return "index";
        }
        return "error";
    }
    public String add(){
        return "add";
    }
    public String addList(){
        String s = bs.addList(book);
        if ("ok".equals(s)){
            return "addSuccess";
        }
        return "error";
    }
    public String deleList(){
        bs.deleList(bookIds);
        return "delete";
    }
    public String rev(){
        list = bs.getRevList(id);
        if(list.size()>0){
            return "rev";
        }
        return "error";
    }
    public String revList(){
        String s = bs.revList(book,book.getBookId());
        if("ok".equals(s)){
            return "revamp";
        }
        return "error";
    }

    public Book getModel() {
        this.book = new Book();
        return book;
    }
}
