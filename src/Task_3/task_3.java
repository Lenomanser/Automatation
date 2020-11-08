package Task_3;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

// Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        System.out.println("multiplication table of number " + numb);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numb + " * " + i + " = " + (numb * i));
        }
    }
}
