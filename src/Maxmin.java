public class Maxmin {
    public static void main(String[] args) {

        int[] array = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int min = array[0];
        int max = array[0];

        for (int n = 0; n < array.length; n++) {
            if (min > array[n]) {
                min = array[n];
            }
        }
        for (int n = 0; n <= array.length - 1; n++) {
            if (max < array[n]) {
                max = array[n];
            }
        }
        System.out.println("Минимальный элемент в массиве равен " + min);
        System.out.println("Максимальный элемент в массиве равен " + max);
    }
}