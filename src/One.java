import java.util.Random;
import java.util.Scanner;

/*
Создайте массив целых чисел. Напишете программу, которая выводит
        сообщение о том, входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).
*/

public class One {
    public static void main(String[] args) {

        System.out.print("Задайте количество элементов массива ");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        System.out.print("Задайте нижнюю границу для интервала элементов массива ");
        int min = scanner.nextInt();
        System.out.print("Задайте верхнюю границу для интервала элементов массива ");
        int max = scanner.nextInt();
        int[] ar = new int[len];
        int summa = 0;

        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * (max - min));
            System.out.print(" " + ar[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Задайте целое число, которое нужно найти в массиве ");
        int number = scanner.nextInt();
        int a = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == number) {
                a = a + 1;
            }
        }
        if (a == 0) {
            System.out.println("Число " + number + " не входит в данный массив");
        } else {
            System.out.println("Число " + number + " входит в данный массив " + a + " раза");
        }
    }
}
