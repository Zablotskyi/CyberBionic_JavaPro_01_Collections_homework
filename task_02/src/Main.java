import java.util.ArrayList;
import java.util.Iterator;

//Завдання 2
//Виведення на екран елементів List: Створити список, заповнити його на 10 елементів та вивести на екран вміст,
//використовуючи iterator.
public class Main {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        System.out.println("Вміст списку виведено через Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
