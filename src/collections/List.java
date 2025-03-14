package collections;

import exceptions.EmptyListException;

public interface List<E> {
    void add(E value);
    void insert(E value);
    void insert(int index, E value);

    E removeLast() throws EmptyListException;
    E removeFirst() throws EmptyListException;
    E removeByIndex(int index) throws EmptyListException;


    E get(int index);
    void set(int index, E value);

    int size();
    boolean isEmpty();

    void clear();

}