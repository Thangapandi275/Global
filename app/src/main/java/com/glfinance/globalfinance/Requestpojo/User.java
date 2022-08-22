package com.glfinance.globalfinance.Requestpojo;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("fname")
    public String fname;
    @SerializedName("lname")
    public String lname;
    @SerializedName("mail")
    public String mail;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public User(String fname, String lname, String mail) {
        this.fname = fname;
        this.lname = lname;
        this.mail = mail;
    }

}
