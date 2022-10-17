import java.util.Arrays;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("______________Задание 1____________");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Общаяя сумма затрат в месяц равна = " +sum);
        System.out.println();

        System.out.println("______________Задание 2____________");
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальные затраты равны = " + min);
        System.out.println("Максимальные затраты равны = " + max);
        System.out.println();

        System.out.println("______________Задание 3____________");
        int sum2 = 0;
        for (int value2 : arr) {
            sum2 += value2;
        }
        System.out.println("Среднее количество трат в месяц равно = " + sum2/(float)arr.length);
        System.out.println();


        System.out.println("______________Задание 4____________");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}