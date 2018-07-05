package com.example.lenovo.test_5_7inhertance;
//1234567890
public class Muahamd extends Student{
    @Override
    public void setName(String name) {
        this.name=name;
        super.setName(name);
    }

    @Override
    public int getStage() {
        return super.getStage();
    }

    @Override
    public void setStage(int stage) {
        this.stage=stage;
        super.setStage(stage);
    }

    @Override
    public void displayInformation(String name) {
        this.name=name;
        super.displayInformation(name);
        Object obj;
    }

    @Override
    public void displayInformation(String name, int stage) {
        this.name=name;
        this.stage=stage;
        super.displayInformation(name, stage);
    }
}
