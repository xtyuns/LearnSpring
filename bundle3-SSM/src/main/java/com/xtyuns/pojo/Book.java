package com.xtyuns.pojo;

import java.util.Date;

public class Book {
    private Integer id;
    private String bName;
    private String author;
    private String pubComp;
    private Date pubDate;
    private Integer bCount;
    private Float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubComp() {
        return pubComp;
    }

    public void setPubComp(String pubComp) {
        this.pubComp = pubComp;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Integer getbCount() {
        return bCount;
    }

    public void setbCount(Integer bCount) {
        this.bCount = bCount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bName='" + bName + '\'' +
                ", author='" + author + '\'' +
                ", pubComp='" + pubComp + '\'' +
                ", pubDate=" + pubDate +
                ", bCount=" + bCount +
                ", price=" + price +
                '}';
    }
}