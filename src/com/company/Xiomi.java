package com.company;

public class Xiomi extends Phone implements Printable {
    private String made;
    private String make;


    public Xiomi(String model, int price, String made, String make) {
        super(model, price);
        this.made = made;
        this.make = make;
    }

    public String getMade() {
        return made;
    }

    public String getMake() {
        return make;
    }

    @Override
    public void print() {
        System.out.println(" сделано " + getMade() + " делается " + getMake() + " модель " + getModel()+
                " цена " + getPrice());
    }
}
