/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author nhuth
 */
public class Comment {
    private int comment_id;
    private int comment_pid;
    private int comment_accid;
    private String comment_name;
    private String comment_descrsiption;
    private int comment_star;
    private Date date;

    public Comment() {
    }

    public Comment(int comment_id, int comment_pid, int comment_accid, String comment_name, String comment_descrsiption, int comment_star, Date date) {
        this.comment_id = comment_id;
        this.comment_pid = comment_pid;
        this.comment_accid = comment_accid;
        this.comment_name = comment_name;
        this.comment_descrsiption = comment_descrsiption;
        this.comment_star = comment_star;
        this.date = date;
    }

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public int getComment_pid() {
        return comment_pid;
    }

    public void setComment_pid(int comment_pid) {
        this.comment_pid = comment_pid;
    }

    public int getComment_accid() {
        return comment_accid;
    }

    public void setComment_accid(int comment_accid) {
        this.comment_accid = comment_accid;
    }

    public String getComment_name() {
        return comment_name;
    }

    public void setComment_name(String comment_name) {
        this.comment_name = comment_name;
    }

    public String getComment_descrsiption() {
        return comment_descrsiption;
    }

    public void setComment_descrsiption(String comment_descrsiption) {
        this.comment_descrsiption = comment_descrsiption;
    }

    public int getComment_star() {
        return comment_star;
    }

    public void setComment_star(int comment_star) {
        this.comment_star = comment_star;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Comment{" + "comment_id=" + comment_id + ", comment_pid=" + comment_pid + ", comment_accid=" + comment_accid + ", comment_name=" + comment_name + ", comment_descrsiption=" + comment_descrsiption + ", comment_star=" + comment_star + ", date=" + date + '}';
    } 
    
}
