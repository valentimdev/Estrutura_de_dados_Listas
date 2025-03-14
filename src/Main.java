import collections.List;
import collections.StaticList;
import collections.ArrayList;
import collections.DoublyLinkedList;
import collections.LinkedList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> minhaList= new ArrayList<>(5);
//        minhaList.add(1);
//        minhaList.add(2);
//        minhaList.add(3);
//        System.out.println(minhaList);
//        minhaList.removeFirst();
//        System.out.println(minhaList);
        // LinkedList<Integer> lista = new LinkedList<Integer>();
        // lista.add(1);
        // lista.add(2);
        // lista.add(3);

        // lista.removeLast();
        // lista.set(3, 10);
        // System.out.println(lista);

        DoublyLinkedList<Integer> lista = new DoublyLinkedList<>();
        lista.add(0);
        lista.add(4);
        lista.add(3);
        lista.add(2);
        lista.add(1);
        System.out.println(lista);
        lista.removeByIndex(2);
        System.out.println(lista);
        System.out.println(lista.printReverse());
        lista.removeLast();
        System.out.println(lista);
        System.out.println(lista.printReverse());

        lista.removeFirst();
        System.out.println(lista);
        System.out.println(lista.printReverse());

    }
}