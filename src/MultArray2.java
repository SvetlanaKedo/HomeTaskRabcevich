import java.util.Arrays;

/*
Шахматная доска. Создать программу для раскраски шахматной доски с помощью цикла.
Создать двумерный массив String'ов 8х8.
С помощью циклов задать элементам циклам значения B(Black) или W(White).
*/
public class MultArray2 {
    public static void main(String[] args) {

        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                if ((i + j) % 2 == 0) chess[i][j] = "W";
                else chess[i][j] = "B";
            }
        }
        for (String[] board : chess) {
            System.out.println(Arrays.toString(board));
        }
    }
}
