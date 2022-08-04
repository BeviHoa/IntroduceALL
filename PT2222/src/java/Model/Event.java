/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author hongd
 */
public class Event {
    private int id;
    private String content;
    private Date date;
    private boolean isEnabled;
    private String createby;

    public Event() {
    }

    public Event(int id, String content, Date date, boolean isEnabled, String createby) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.isEnabled = isEnabled;
        this.createby = createby;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }
    
    
}
