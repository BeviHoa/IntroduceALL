/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

/**
 *
 * @author VinhPhu
 */
public class Event {
    private int id;
    private String content;
    private String date;
    private boolean ena;
    private String create;

    public Event() {
    }

    public Event(int id, String content, String date, boolean ena, String create) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.ena = ena;
        this.create = create;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isEna() {
        return ena;
    }

    public void setEna(boolean ena) {
        this.ena = ena;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }
    
}
