package Task_1;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
// Создать двумерный массив строковых данных. Пользователь вводит с консоли два произвольных числа
// (в рамках размера массива) и приложение выводит соответствующий элемент массива.
        String array[][] = {{"Скажи ",   "мне сладкую ",  "ложь"},
                            {"Скажи ",    "мне прямо  ",  "в лицо"},
                            {"Скажи ",    "что любишь ",  "меня"},
                            {"Но "   ,    "уже так"    ,  "всё равно"}};
        System.out.println("Enter first index ( 0-3)");
        Scanner in = new Scanner(System.in);
        int index1 = in.nextInt();
        System.out.println("Enter second index (0-2)");
        int index2 = in.nextInt();
        System.out.println("element of array" + array[index1][index2]);
    }
}
