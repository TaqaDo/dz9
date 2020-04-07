package com.company;

public class Samsung extends Phone implements Printable {
    private int year;
    private int buy;
    private String className;

    public Samsung(int year, int buy, String className, String model, int price) {
        super(model, price);
        this.year = year;
        this.buy = buy;
        this.className = className;
    }

    public int getYear() {
        return year;
    }

    public int getBuy() {
        return buy;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public void print() {
        System.out.println(" год " + getYear() + " купить " + getBuy() + " имя класса "
        + getClassName()+ " модель " + getModel() + " цена " + getPrice());
    }

}
