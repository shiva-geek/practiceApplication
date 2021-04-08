package com.springboot.practice.users;

import java.util.Date;

public class User {
private Integer id;
private String name;
private Integer age;
private String dept;
private Date joiningDate;

public User(Integer id,String name,Integer age,String dept,Date joiningDate){
    this.id = id;
    this.name = name;
    this.age = age;
    this.dept = dept;
    this.joiningDate = joiningDate;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
}
