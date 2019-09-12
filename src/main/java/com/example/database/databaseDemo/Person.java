package com.example.database.databaseDemo;

import java.util.Date;


public class Person {

    private Integer id;
    private String name;
    private String emailid;
    private Date timestamp;

    public Person(){

    }

    public Person(Integer id, String name, String emailid, Date timestamp) {
        this.id = id;
        this.name = name;
        this.emailid = emailid;
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
