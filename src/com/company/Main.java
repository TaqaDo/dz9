package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Samsung").print();
        createObject("Huawei").print();
        createObject("Xiomi").print();


    }
    public static Printable createObject (String className) {
        Printable printable = null;
        switch (className) {
            case "Samsung":
                printable = new Samsung( 2018, 500, "",
                        "S4", 500) ;
                break;

            case "Huawei" :
                printable = new Huawei("redmi", 250, "d5", 4.4);
                break;

            case "Xiomi" :
                printable = new Xiomi("G6", 200, "China", "Guanjou");
                break;
        }
         return printable;

    }

}
