import java.util.Scanner;

public class LinkedList {
//    Голова списка
    private Node head;
//    Вставление элемента в начало списка
    public  void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
//    Удаление первого элемента
    public void deleteFirst()
    {
        head = head.next;
    }
//    Вывод всего списка
    public void printLinkedList()
    {
        Node current = head;
        while (current != null)
        {
            current.displayNodeData();
            current = current.next;
        }
    }
    public void insertLast(int data)
    {
        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
    public void cyclicShiftLeft()
    {
        System.out.println("Введите число, на которое надо сдвинуть список");
        Scanner in = new Scanner(System.in);
        int shift = in.nextInt();
        for (int i = 0; i < shift; i++)
        {
            insertLast(head.data);
            deleteFirst();
        }
        System.out.println("Список со сдвигом - " + shift);
        printLinkedList();
    }
}
