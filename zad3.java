package java_98_388;

public class zad3 {
    public static void main(String[] args) {
        char data1 = 65;  // A
        System.out.println(data1 + " data1");

        long data2 = 65; // 65
        System.out.println(data2 + " data2");

        float data3 = new Float(" -65.0"); // -65 java 12 / blad
        System.out.println(data3 + " data3");

        short data4 = new Short("65.0"); // exception
        System.out.println(data4 + "data4");




    }
}
