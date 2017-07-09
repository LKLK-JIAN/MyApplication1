package com.example.myapplication1.shujuku.model;

/**
 * Created by 老盖 on 2017/6/18.
 */

public class Contact {
    private int cid;
    private String cname;
    private String cphone;

    public Contact() {

    }

    public Contact(int cid, String cname, String cphone) {
        this.cid = cid;
        this.cname = cname;
        this.cphone = cphone;
    }

    public Contact(String cname, String cphone) {
        this.cname = cname;
        this.cphone = cphone;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cphone='" + cphone + '\'' +
                '}';
    }
}
