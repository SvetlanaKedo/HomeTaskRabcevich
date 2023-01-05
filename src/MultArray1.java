import java.util.Arrays;

/*
Создать трехмерный массив из целых чисел.С помощью циклов "пройти"
по всему массиву и увеличить каждый элемент на заданное число.
Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
*/
public class MultArray1 {
    public static void main(String[] args) {
    int[][][] array = {
            {
                    {1, 2, 3},
                    {4, 5, 6}
            },
            {
                    {7, 8, 9},
                    {10,11,12},
                    {13,14,15}}
            };
        for (int[][] arrayElement : array) {
                                System.out.println(Arrays.toString(arrayElement));
                }
            }
}


