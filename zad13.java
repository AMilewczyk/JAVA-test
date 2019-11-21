package java_98_388;

public class zad13 {
    public static void traverse(String board) {
        for (int x = 0; x < board.length(); x++) {
            for (int y = 0; y < board.length(); y++) {
                System.out.println(board);
            }
        }
    }
    public static void main(String[] args) {

        traverse("w2222222");
    }
}
