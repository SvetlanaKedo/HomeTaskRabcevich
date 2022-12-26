import java.util.Random;
import java.util.Scanner;

/*
Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение. Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.
*/
public class Three {
    public static void main(String[] args) {

        System.out.print("Задайте количество элементов массива ");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        System.out.print("Задайте нижнюю границу для интервала элементов массива ");
        int min = scanner.nextInt();
        System.out.print("Задайте верхнюю границу для интервала элементов массива ");
        int max = scanner.nextInt();
        int[] ar = new int[len];


        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * (max - min));
            System.out.print(" " + ar[i] + " ");
        }

        int minar = ar[0];
        int maxar = ar[0];
        int summa = 0;

        for (int i = 0; i < ar.length; i++) {
            summa = summa + ar[i];
            if (minar > ar[i]) {
                minar = ar[i];
            }
        }
        for (int i = 0; i <= ar.length - 1; i++) {
            if (maxar < ar[i]) {
                maxar = ar[i];
            }
        }

        double average = summa / ar.length;

        System.out.println();
        System.out.println("Минимальный элемент в массиве равен " + minar);
        System.out.println("Максимальный элемент в массиве равен " + maxar);
        System.out.printf("Среднее арифметическое элементов массива данного массива равно %.2f ", average);
    }
}
