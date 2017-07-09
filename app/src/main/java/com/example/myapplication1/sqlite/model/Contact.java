package com.example.myapplication1.sqlite.model;

/**
 * Created by 老盖 on 2017/5/7.
 */

public class Contact {
    private int cid;
    private String FIELD_CNAME;
    private String FIELD_CPHONE;
    public Contact(){}
    public Contact(int cid, String FIELD_CNAME, String FIELD_CPHONE) {
        this.cid = cid;
        this.FIELD_CNAME = FIELD_CNAME;
        this.FIELD_CPHONE = FIELD_CPHONE;
    }

    public Contact(String FIELD_CPHONE, String FIELD_CNAME) {
        this.FIELD_CPHONE = FIELD_CPHONE;
        this.FIELD_CNAME = FIELD_CNAME;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getFIELD_CNAME() {
        return FIELD_CNAME;
    }

    public void setFIELD_CNAME(String FIELD_CNAME) {
        this.FIELD_CNAME = FIELD_CNAME;
    }

    public String getFIELD_CPHONE() {
        return FIELD_CPHONE;
    }

    public void setFIELD_CPHONE(String FIELD_CPHONE) {
        this.FIELD_CPHONE = FIELD_CPHONE;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cid=" + cid +
                ", FIELD_CNAME='" + FIELD_CNAME + '\'' +
                ", FIELD_CPHONE='" + FIELD_CPHONE + '\'' +
                '}';
    }
}
