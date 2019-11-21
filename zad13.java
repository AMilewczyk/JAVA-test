package java_98_388;

public class zad13 {
    String board;
    public static void traverse(String[][] board) {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board.length; y++) {
                System.out.println(board);
            }
        }
    }
    public static void main(String[] args) {


        String[][] board2 = new String[1][2];
        for (int i = 0; i < board2.length ; i++) {
            for (int j = 0; j < board2.length ; j++) {
                System.out.println(board2);

            }

        }



    }
}
