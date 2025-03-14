package collections;

import exceptions.EmptyListException;
import exceptions.FullListException;

import java.util.Arrays;

public class StaticList<E> implements List<E>{
    protected int size;
    protected E[] list;

    private final int MAX_SIZE = 10;

    @SuppressWarnings("unchecked")
    public StaticList() {
        list = (E[])new Object[MAX_SIZE];
    }
    @SuppressWarnings("unchecked")
    public StaticList(int size) {
        list = (E[])new Object[MAX_SIZE];
    }

    @Override
    public void add(E value) {
        if(isFull()) throw new FullListException( "List is full");
        list[size++] = value;
    }

    @Override
    public void insert(E value) {
        if(isFull()) throw new FullListException( "List is full");

        for(int i = size;i >0;i--){
            list[i] = list[i-1];
        }
        list[0]=value;
        size++;
    }

    @Override
    public void insert(int index, E value) {
        if(index<=0){
            insert(value);
        }else if(index>=size){
            add(value);
        }else{
        if(isFull()) throw new FullListException( "List is full");

        for(int i = size;i >index;i--){
            list[i] = list[i-1];
        }
        list[index]=value;
        size++;}
    }

    @Override
    public E removeLast() throws EmptyListException {
        if(isEmpty()) throw new EmptyListException( "List is empty");
        return list[--size];
    }

    @Override
    public E removeFirst() throws EmptyListException {
        if(isEmpty()) throw new EmptyListException( "List is empty");
        E value = list[0];
        size--;
        for(int i= 0; i < size;i++){
            list[i] = list[i+1];
        }
        return value;
    }

    private void checkIndex(int index) {
        if(index<0 || index>=size) throw new IndexOutOfBoundsException("Index out of bounds");

    }
    @Override
    public E removeByIndex(int index) throws EmptyListException {
        if (isEmpty()) throw new EmptyListException( "List is empty");
        checkIndex(index);

        E value = list[index];
        size--;
        for(int i = index+1; i < size;i++){
            list[i] = list[i+1];
        }
        return value;
    }

    @Override
    public E get(int index) {
        if(isEmpty()) throw new EmptyListException("Static List is Empty");
        checkIndex(index);

        return list[index];
    }


    @Override
    public void set(int index, E value) {
        if(isEmpty()) throw new EmptyListException( "List is empty");
        checkIndex(index);
        list[index] = value;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull(){
        return size == list.length;
    }

    @Override
    public String toString() {
       String datalist = "[";
       for(int i =0; i<size; i++){
           datalist += list[i];
           if(i<size-1) {
               datalist += ", ";
           }
       }
       return datalist + ']';
    }
    public void clear(){
        size = 0;
    }
}
