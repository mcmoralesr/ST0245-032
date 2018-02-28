public class MiArrayList<Array> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Array elements[]; 

    // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULArray_CAPACIArrayY. No, no recibe parámetros. public MiArrayList() {}          // Retorna el tamaño de la lista public int size() {}          // Agrega un elemento e a la última posición de la lista public void add(int e) {}          // Retorna el elemento que se encuentra en la posición i de la lista public int get(int i) {}          // Agrega un elemento e en la posición index de la lista
    public MiArrayList() {
        this.elements = (Array []) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }     

    // Retorna el tamaño de la lista 
    public int size() {
        return this.size;
    }   

    // Agrega un elemento e a la última posición de la lista
    //ayuda de http://www.docjar.com/html/api/java/util/ArrayList.java.html

    public void add( int index, Array elemento) {
        if (this.size == elements.length) {
            Array array[] = (Array[]) new Object[this.size * 2]; //el tamaño del arreglo se duplica 
            this.elements = array;
        }

        Array array[] = (Array[]) new Object[this.size];

        for (int i = 0; i < index; i++)
            array[i] = this.elements[i];

        array[index] = elemento;

        for (int i = index + 1; i < this.size; i++)
            array[i] = this.elements[i - 1];

        size++;
        this.elements = array;
    }    

    // Retorna el elemento que se encuentra en la posición i de la lista 
    public Array get(int i) throws Exception{
        if(i < this.size || i < 0){
            return this.elements[i];
        }else
            throw new Exception(" IndexOutOfBounds");

    }

    // Agrega un elemento e en la posición index de la lista
    public void add(int Array, int elemento) {
        add(this.size, elemento);
     } 

}