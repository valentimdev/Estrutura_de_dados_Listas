package collections;

public class ArrayList<E> extends StaticList<E>{

    private void recreateArray(){
        E[] newList = (E[]) new Object[list.length * 2];
        for(int i = 0; i < size; i++){
            newList[i] = list[i];
        }
        list = newList;
    }
    public ArrayList(int MAX_SIZE){
        super(MAX_SIZE);
    }
    @Override
    public void add(E value) {
        if(isFull()) recreateArray();
        list[size] = value;
        size++;
    }
    @Override
    public void insert(int index, E value) {
        super.insert(index, value);
    }
    @Override
    public void insert(E value) {
        super.insert(value);
    }
}
