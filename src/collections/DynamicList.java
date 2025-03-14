package collections;

public abstract class DynamicList<E> implements List<E> {

    class Node{
        E value;
        Node next;
        Node prev;
        public Node(E value) {
            this.value = value;
        }
        
    }

    protected int size; 
    protected Node head;
    protected Node tail;

    protected void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }

    protected Node getNodeByIndex(int index){
        Node auxNode = head;
        for(int i = 0; i < index; i++){
            auxNode = auxNode.next;
        }
        return auxNode;
    }

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;        
    }

    @Override
    public boolean isEmpty() {
        
        return size == 0;
    }

    @Override
    public int size() {        
        return size;
    }

    @Override
    public String toString() {
        String dataString = "[";
        Node auxNode = head;
        while (auxNode != null) {
            dataString += auxNode.value;
            if(auxNode.next!=null){
                dataString += " -> ";

            }

            auxNode = auxNode.next;
        }
        return dataString + "]";
    }


    
    
}
