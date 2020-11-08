package Task_9;
import java.io.File;
//. Дан пусть к файлу в файловой системе. Необходимо найти имя файла без расширения и вывести на экран.
public class task_9 {
    public static void main(String[] args) {

        File directory = new File("C://Users//Лена//Desktop//Automatization");
        File[] list=directory.listFiles();
        for (int i=0;i<list.length;i++)
             {
            if (list[i].getName().contains(".")) {
                continue;
            } else
                System.out.println(list[i].getName());
        }

    }
}
