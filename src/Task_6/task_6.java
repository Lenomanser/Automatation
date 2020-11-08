package Task_6;
import java.io.File;
enum Animal {CAT, DOG, GUINEA_PIG}
enum Gender {male, female}

class Zoostore {
    Animal animal;
    Gender gender;
    int cost;
    int count;

    Zoostore(Animal animal, Gender gender, int count, int cost) {
        this.animal = animal;
        this.gender = gender;
        this.count = count;
        this.cost = cost;
    }

    public void animal_cost() {
        int totalCost = cost * count;
        if (gender == Gender.female) {
            totalCost += count;
        }
        System.out.println(totalCost);

    }
}

public class task_6 {
    public static void main(String[] args) {
        Zoostore buy = new Zoostore(Animal.CAT, Gender.female, 4, 10);
        buy.animal_cost();
    }
}
