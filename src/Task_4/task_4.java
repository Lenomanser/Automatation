package Task_4;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        // вводит с консоли число. Если оно четное - прибавить к нему 1 и вывести на экран результат,
        //  если оно не четное - то отнять от него 3 и вывести на экран
        System.out.println("Enter your number");
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        if (numb % 2 == 0 && numb != 0) {
            System.out.println(numb + 1);
        }
        else if (numb == 0) {
            System.out.println("Hello world");
        }
        else {
            System.out.println(numb -= 3);
        }
    }
}
