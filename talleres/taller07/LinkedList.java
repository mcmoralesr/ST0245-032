import java.lang.IndexOutOfBoundsException;

public class LinkedList{
    private Node first;
    private int size;    



    public LinkedList(){
        size = 0;
        first = null;
    }


    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size(){
        return this.size;
    }

    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return temp.data;
    }

    public void insert(int data, int index){
        Node nodo1 = new Node(data);

        if (index ==0){
            nodo1.next = first;
            first = nodo1;
        } else {
            Node temp = this.getNode(index - 1);
            nodo1.next = temp.next;
            temp.next = nodo1;
        }
        size++;
    }

    public void remove(int index){
        if(index == 0){
            first = this.getNode(index + 1 );
        }else{
            Node temp = this.getNode(index -1);
            temp.next = this.getNode(index).next;
        }
        size --;
    } 

    public boolean contains(int data){
        Node currentnode = first;
        while (currentnode != null){
            if(currentnode.data == data) 
                return true;
                currentnode = currentnode.next;
            }
        return false;
    }

    public int maximo(){
        return maximoAux(this.first);
    }

    private  int maximoAux(Node nodo2){
        if (nodo2.next == null){
            return nodo2.data;
        } else{
            return Math.max(nodo2.data, maximoAux(nodo2.next));
        }
    }
       
      public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.insert(5, 0);
        list.insert(4, 0);
        list.insert(3, 0);
        list.insert(2, 0);
        list.insert(1, 0);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println(list.contains(3));
        list.remove(2);
        System.out.println(list.contains(3));
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }

}



