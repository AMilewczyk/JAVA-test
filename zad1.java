package java_98_388;

public class zad1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = ++a * b--;
        System.out.println(c);
        // 60
        int d = a-- + ++b;
        System.out.println(d);
        // 16
    }
}
