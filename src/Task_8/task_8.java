package Task_8;
import java.util.Scanner;

public class task_8 {
    /* Пользователь вводит 2 числа с консоли. Программа должна вывести на экран результат деление
    одного числа на другое Если во время операции деления одно из значений = 0,  то отлавливать исключение и выводить на экран сообщение сообщение
    "Введенное вами число выходит за рамки допустимых значений"*/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int first_num = in.nextInt();
        System.out.println("Enter second number");
        int Second_num = in.nextInt();
        try {
            System.out.println("Результат деления = " + first_num / Second_num);
            }
             catch (Exception ex)
             {
            System.out.println("Введенное вами число выходит за рамки допустимых значений");
             }
    }
}
