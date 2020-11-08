package Task_5;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        // Задан массив из 10 числе. Найти минимальное и максимальное значение в нем
        int[] array = {75, 16, 77, -33, 12, 11, 11, 34, -99, 2};
        int max = array[0], min = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max value =" + max + " , min value = " + min);
    }
}
