package com.example.lenovo.test_5_7inhertance;

import android.util.Log;

public class Student {
   String name;
    int stage;

    public Student(){
//grhguyfiujgokgijuerywg
    }

    public Student(String name, int stage) {
        this.name = name;
        this.stage = stage;
    }

    public String getName() {
        return name;
    }

    public int getStage() {
        return stage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void displayInformation(String name){
        Log.i("displayInformation","student Name : "+name);
    }
    public void displayInformation(String name,int stage){
        Log.i("displayInformation","student Name : "+name+" Student age "+stage);
    }
}
