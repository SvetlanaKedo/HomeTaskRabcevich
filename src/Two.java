import java.util.Scanner;

/*
Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива. Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщение об этом.
В результате должен быть новый массив без указанного числа.
*/
public class Two {
    public static void main(String[] args) {

        int[] ar = {5, 8, 9, 10, 11, 12, 13, 11};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Задайте целое число, которое нужно удалить из массива ");
        int number = scanner.nextInt();
        int a = 0;


        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == number) {
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Число " + number + " не входит в данный массив");
        }

        System.out.println(" ");

        int[] ar1 = new int[ar.length - a];
        int j = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != number) {
                ar1[j] = ar[i];
                j++;

            }
        }

        for (j = 0; j < ar1.length; j++) {
            System.out.print(" " + ar1[j] + " ");
        }
    }
}