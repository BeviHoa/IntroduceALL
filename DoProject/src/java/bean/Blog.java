/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Date;

/**
 *
 * @author khanh doan
 */
public class Blog {
    private int id;
      private String thumbnail;
      private String title;
      private Date postdate;
      private String author;
      private int category;
      private String postdetail;
      private String brief_info;

    public Blog() {
    }

    public Blog(int id,String thumbnail, String title, Date postdate, String author, int category, String postdetail, String brief_info) {
        this.id=id;
        this.thumbnail = thumbnail;
        this.title = title;
        this.postdate = postdate;
        this.author = author;
        this.category = category;
        this.postdetail = postdetail;
        this.brief_info = brief_info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPostdate() {
        return postdate;
    }

    public void setPostdate(Date postdate) {
        this.postdate = postdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

  

    public String getPostdetail() {
        return postdetail;
    }

    public void setPostdetail(String postdetail) {
        this.postdetail = postdetail;
    }

    public String getBrief_info() {
        return brief_info;
    }

    public void setBrief_info(String brief_info) {
        this.brief_info = brief_info;
    }

    @Override
    public String toString() {
        return "Blog{" + "id=" + id + ", thumbnail=" + thumbnail + ", title=" + title + ", postdate=" + postdate + ", author=" + author + ", category=" + category + ", postdetail=" + postdetail + ", brief_info=" + brief_info + '}';
    }
      
      
}
