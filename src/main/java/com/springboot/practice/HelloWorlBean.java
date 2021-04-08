package com.springboot.practice;


public class HelloWorlBean {

    private String message;

    public HelloWorlBean(String message){
        this.message =message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
