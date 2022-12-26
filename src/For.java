/*
Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных cтроках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны).
*/
public class For {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {1, 1, 1, 1, 1};

        System.out.println("Массив array: ");
        for (int i = 0; i <= 4; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println();
        System.out.println("Массив array1: ");

        for (int i = 0; i <= 4; i++) {
            System.out.print(" " + array1[i] + " ");
        }
        System.out.println();
        int summa = 0;
        int summa1 = 0;

        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        for (int i = 0; i < array1.length; i++) {
            summa1 = summa1 + array1[i];
        }

        double average = summa / array.length;
        double average1 = summa1 / array1.length;

        if (summa1 == summa) {
            System.out.println("Cреднее арифметические двух массивов равны");
        } else {
            if (summa1 > summa) {
                System.out.println("Cреднее арифметическое  массива array1 равно " + average1 + " это больше, чем среднее арифметическое  массива array, которое равно " + average);
            } else {
                System.out.println("Cреднее арифметическое  массива array1 равно " + average + " это больше, чем среднее арифметическое  массива array, которое равно " + average1);
            }

        }
    }
}

