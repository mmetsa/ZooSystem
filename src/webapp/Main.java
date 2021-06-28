package webapp;

import model.Animal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



        int[] numbers = new int[10];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 5;
        System.out.println(Arrays.toString(numbers));
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 2;
        numbers[9] = 2;
        System.out.println(Arrays.toString(numbers));
       add(numbers, 89);
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 0;
        System.out.println(Arrays.toString(numbers));
        remove(numbers, 2);
        System.out.println(Arrays.toString(numbers));
        removeIndex(numbers, 4);
        System.out.println(Arrays.toString(numbers));


    }

    public static void add(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = number;
                break;
            }
        }
    }

    public static void remove(int[] array, int number) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == number) {
                array[i] = 0;
                break;
            }
        }
    }

    public static void removeIndex(int[] array, int index) {
        array[index] = 0;
    }

}
