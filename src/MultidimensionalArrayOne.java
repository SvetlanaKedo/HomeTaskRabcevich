
/*Создать трехмерный массив из целых чисел.С помощью циклов "пройти" по всему массиву и увеличить каждый элемент
 на заданное число. Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли. */


import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrayOne {
    public static void main(String[] args) {

        int n = 3;
        int[][][] sourcearray = new int[n][n][n];
        Random random = new Random();

        for (int i = 0; i < sourcearray.length; i++) {
            for (int j = 0; j < sourcearray[i].length; j++) {
                for (int k = 0; k < sourcearray[i][j].length; k++) {
                    sourcearray[i][j][k] = random.nextInt(10);
                }
            }
        }

        for (int i = 0; i < sourcearray.length; i++) {
            for (int j = 0; j < sourcearray[i].length; j++) {
                for (int k = 0; k < sourcearray[i][j].length; k++) {
                    System.out.println("[" + i + "][" + j + "][" + k + "] = " + sourcearray[i][j][k]);
                }
            }
        }
        System.out.print("Задайте число, на которое нужно увеличить каждый элемент массива  ");
        Scanner scanner = new Scanner(System.in);
        int increasenumber = scanner.nextInt();

        for (int i = 0; i < sourcearray.length; i++) {
            for (int j = 0; j < sourcearray[i].length; j++) {
                for (int k = 0; k < sourcearray[i][j].length; k++) {
                    sourcearray[i][j][k] =  sourcearray[i][j][k] + increasenumber ;
                    System.out.println("[" + i + "][" + j + "][" + k + "] = " + sourcearray[i][j][k]);
                }
            }
        }

    }
}