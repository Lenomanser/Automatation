package Task_10;

import java.util.ArrayList;
import java.util.Scanner;

public class task_10 {

    public static void moving(String direct, int index, ArrayList<String> collect1) {
        if (direct.equals("Left")) {
            System.out.println(" движемся в лево ");
            for (int i = index; i >= 0; i--) {
                System.out.println(collect1.get(i));
            }

        }
        if (direct.equals("Right")) {
            System.out.println(" движемся в право ");
            for (int i = index; i <= collect1.size()-1; i++) {
                System.out.println(collect1.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> collect = new ArrayList<String>();
        String St = "Четыре негритенка пошли купаться в море " +
                "Один попался на приманку  их осталось трое";
        String[] words = St.split(" ");
        for (int i = 0; i < words.length; i++) {
            collect.add(words[i]);
        }

        System.out.println(collect.size());
        System.out.println(" укажите номер элемента в коллекции ");
        Scanner in1 = new Scanner(System.in);
        int NumOFelement = in1.nextInt();
        System.out.println("Укажите направление по коллекции Введите 'Left' or 'Right' ");
        Scanner in = new Scanner(System.in);
        String index1 = in.nextLine();
        moving(index1, NumOFelement, collect);
    }
}