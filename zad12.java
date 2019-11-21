package java_98_388;

import java.util.ArrayList;



public class zad12 {
    public static void Process(ArrayList<String> invoices) {
        for (int i = 0; i < invoices.size() - 1; i++) {

            String invoice = invoices.get(i);
            invoices.remove(i);
        }
    }
    public static void main(String[] args) {


        //test stringa
        /*
        String pusty = null;
        System.out.println(pusty);
        String[] cos = new String[1];
        System.out.println(cos[0]);

        System.out.println("-------------");
        System.out.println(2 + "3");
        System.out.println("5" + "6");

        System.out.println("----------");
        String test = "test";
        String testDokladny = test.concat(" dokladny");
        test.concat("jest");

        System.out.println(testDokladny);
        System.out.println(test);
         */

    }
}
