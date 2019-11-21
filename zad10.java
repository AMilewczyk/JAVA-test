package java_98_388;

public class zad10 {
    public static int fee(char model) {
        int price = 0;
        switch (model) {
            case 'A':
                price = 50;  //50
                break;
            case 'T':
                price = 20; //20
                break;
            case 'C':
                price = 5;  // 5
                break;
            default:
                price = 100;  //100
                break;
        }
        return price;
    }
    public static void main(String[] args) {



        System.out.println(fee('A'));
        System.out.println(fee('T'));
        System.out.println(fee('C'));

    }
}
