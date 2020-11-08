package Task_2;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
//1. Напишите программу, которая выводит все числа, которые делятся на 5 от 2 до 50 включительно.*******
        for (int i = 5; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ";  ");
            }
        }
    }
}
