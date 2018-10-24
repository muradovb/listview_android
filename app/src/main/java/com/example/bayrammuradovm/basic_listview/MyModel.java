package com.example.bayrammuradovmustafa.crocusofttask2;

public class MyModel {

    //properties
    private String message;
    private String time;
    private int myImages;


    //constructor
    public MyModel( String mess, String time, int myImages) {
        this.message= mess;
        this.time= time;
        this.myImages= myImages;
    }

    //def. constructor
    public MyModel() {
        message="";
        time="";
        myImages=0;
    }


    //methods
    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public int getImage() {
        return myImages;
    }

    public void setMessage(String newMessage) {
        message=newMessage;
    }

    public void setTime(String newTime) {
        time = newTime;
    }

    public void setMyImages(int newImages) {
        myImages= newImages;
    }



}
