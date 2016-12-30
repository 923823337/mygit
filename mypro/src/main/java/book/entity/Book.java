package book.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by THZ on 2016/12/26.
 */
@Entity
@Table(name = "t_book")
public class Book {
    private Integer bookId;
    private Integer bookCount;
    private String bookName;
    private String bookClass;//类
    private String bookIntr;//简介
    private Double money;
    private Date time;

    @Column(name="bookCount",nullable=false)
    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Column(name="time",nullable=false)
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }

    @Column(name="bookName",nullable=false,length=30)
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Column(name="bookClass",nullable=false,length=20)
    public String getBookClass() {
        return bookClass;
    }

    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

    @Column(name="bookIntr",nullable=false,length=200)
    public String getBookIntr() {
        return bookIntr;
    }

    public void setBookIntr(String bookIntr) {
        this.bookIntr = bookIntr;
    }

    @Column(name="money",nullable=false)
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
