package com.mao.pojo;

import java.util.Date;

public class User {
    private  Integer id;
    private String name;
    private String password;
    private String email;
    private Date date;
    public User(String name, String password, String email, Date date){
        this.name=name;
        this.password=password;
        this.email=email;
        this.date=date;
    }
    public User(){

    }
    public User(Integer id, String name, String password, String email, Date date){
        this.id=id;
        this.name=name;
        this.password=password;
        this.email=email;
        this.date=date;
    }
    @Override
    public String toString() {
        return "User{" + "id="+ id +",name='"+name +'\''+",password='" +password + '\'' + ",email'" + email + '\'' + ",date=" +date + '}';
        }
    public Integer getId(){return id;}
    public void setId(Integer id){
        this.id=id;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
