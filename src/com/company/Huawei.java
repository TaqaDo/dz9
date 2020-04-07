package com.company;

public class Huawei extends Phone implements Printable {

    private String marka;
    private double size;



    public Huawei(String model, int price, String marka, double size) {
        super(model, price);
        this.marka = marka;
        this.size = size;


    }


    public String getMarka() {
        return marka;
    }

    public double getSize() {
        return size;
    }


    @Override
    public void print() {
        System.out.println(" марка " + getMarka() + " размер " + getSize() + " модель " + getModel()+
                " цена " + getPrice());
    }


}
