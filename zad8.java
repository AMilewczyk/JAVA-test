package java_98_388;

public class zad8 {
    int x = 25; // third

    public static void main(String[] args) {
        zad8 app = new zad8();
        {
            int x = 5;
        }
        {
            int x = 10;
        }
        int x = 100; // second
        System.out.println(x);
        System.out.println(app.x);
    }
    public zad8()
    {
     int x = 1;  // first
        System.out.println(x);
    }
}
