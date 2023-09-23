import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
     LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++)
        {
            list.insertFirst((int)( Math.random() * 10));
        }
        System.out.println("Оригинальный список");
    list.printLinkedList();
        System.out.println();
        list.cyclicShiftLeft();

    }
}