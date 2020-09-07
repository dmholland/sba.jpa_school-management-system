package com.github.perscholas.model;

import javax.persistence.*;

// TODO - Annotate and Implement respective interface and define behaviors
@Entity
@Table(name = "student")
public class Student implements StudentInterface{

    @Id
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "name")
     private  String name;

    @Basic
    @Column(name = "password")
     private String password;

    public Student(){

    }

    public Student(String name, String email, String password){
        this.name=name;
        this.email=email;
        this.password=password;
    }

public String getId(){
        return getEmail();
}

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setEmail(String email) {
this.email=email;
    }

    @Override
    public void setName(String name) {
this.name=name;
    }

    @Override
    public void setPassword(String password) {
this.password=password;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';}
}
