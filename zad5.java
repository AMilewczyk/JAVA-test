package java_98_388;

public class zad5 {
    public static void printInt() {
        if (true) {
            int num = 1;
            if (num > 0) {
                num++;
            }
        }
        int num = 1;
        addOne(num);
        num = num - 1;
        System.out.println(num); // 0
    }

    public static void addOne(int num) {
        num = num + 1;
    }
    public static void main(String[] args) {
printInt();

    }


    }
