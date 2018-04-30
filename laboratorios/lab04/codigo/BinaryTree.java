
public class BinaryTree {
    public Node root;
    Node node;

    public BinaryTree(){
        root = null;
    }

    /**
     * @recibe dos int
     * @retorna el mayor entre ambos
     */
    private int max2(int i, int j)
    {
        if (i > j)
            return i;
        return j;
    }

    /**
     * Auxiliar de maxheight, @recibe un Nodo
     * @retorna un int con la altura del tree
     */
    private int maxheightAUX(Node node)
    {
        if (node == null)
            return 0;
        else 
            return max2(maxheightAUX(node.left), maxheightAUX(node.right))+1;
    }

    /**
     * invoca el metodo anterior, @retorna la altura del tree
     */
    public int maxheight()
    {
        return maxheightAUX(root);
    }

    /**
     * Auxiliar de recursivePrint
     * @recibe un Nodo 
     * @retorna los elementos que se encuentren en él
     */private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }

    }

    /**
     * invoca su auxiliar y le pasa el nodo raiz
     */
    public void recursivePrint()
    {
        recursivePrintAUX(root);
    }

    /**
     * invoca el metodo search y le pasa un nodo raiz y una cadena de caracteres
     */
    public boolean search(String s){
        return search(root, s);
    }

    /**
     * @recibe un nodo y una cadena de caracteres
     * @retorna verdadero o falso si encuentra el elemento s
     */
    private boolean search(Node node, String s){
        boolean temp = false;
        if(node == null) {
            return false;
        }else{
            if(node.data != s){
                return search(node.left, s) || search(node.right, s) ;
            } else {

                return true;
            }

        }
    }

    /**
     * @recibe una cadena de caracteres con un nombre
     * @retorna la impresion del nombre
     */
    public void AbuelaMaterna(String nombre){
        Node node;
        node = searchAbuelaAux(nombre);
        if(node!=null){
            if(node.left!=null){
                if(node.left.left!=null){
                    System.out.println("Nombre: " + node.left.left.data);
                    return;
                }
            }   
        }
        System.out.println("No se encontró ese nombre");
    }

    /**
     * busca entre los nodos, @recibe un nodo y una cadena de caracteres
     * 
     */
    public void searchAbuela(Node node,String s){
        if (node != null){
            searchAbuela(node.left,s);
            searchAbuela(node.right,s);
            if(node.data.equals(s)){
                return ;

            }
        }
    }

    /**
     * @recibe una cadena de caracteres, invoca a searchAbuela
     */
    public Node searchAbuelaAux (String s){
        searchAbuela(root, s);
        return node;
    }

}
 