/**
 * @MariaCamilaMorales
 */
public class BinarySearchTree {
    Node root ;
    public BinarySearchTree () {
        root = null ;
    }

    public void insertar(int n) {
        if(root != null){
            insertarAuxiliar(root,n);
        } else {
            Node Raiz1 = new Node(n);
            root = Raiz1;
        }
    }

    private void insertarAuxiliar(Node node, int n){
        Node node1 = node;
        if(n >= node1.data && node1.right == null){
            Node Raiz1 = new Node(n);
            node1.right = Raiz1;
        }else if(n < node1.data && node1.left == null){
            Node Raiz1 = new Node(n);
            node1.left = Raiz1;
        }else if(n >= node1.data && node1.right != null){
            insertarAuxiliar(node1.right,n);
        }else if(n < node1.data && node1.left != null){
            insertarAuxiliar(node1.left,n);
        }
    }

    public boolean buscar(int n){
        return buscarAuxiliar(root, n);
    }

    private boolean buscarAuxiliar(Node node, int n){
        if(node == null){
            return false;
        }
        if(node.data == n){
            return true;
        }
        if(node.data > n){
            return buscarAuxiliar(node.left,n);
        }else{
            return buscarAuxiliar(node.right,n);
        }
    }

    public void borrar(int n) {
        if(root.data == n){
            Node newRoot = root.left;
            MaximoValorDerecha(newRoot,root.right);
            root = newRoot;
        }else{
            borrarAuxiliar(root,n);
        }
    }

    private void borrarAuxiliar(Node node, int n){
        if(n >= node.data){
            if(node.right.data == n){
                node.right = null;
            }else{
                borrarAuxiliar(node.right,n);
            }
        }else if(n < node.data){
            if(node.left.data == n){
                node.left = null;
            }else{
                borrarAuxiliar(node.left,n);
            }
        }
    }

    // ayuda de https://www.geeksforgeeks.org/binary-search-tree-set-2-delete/

    private void MaximoValorDerecha(Node root,Node derecho){
        if(root.right == null){
            root.right = derecho;
        }else{
            MaximoValorDerecha(root.right,derecho);
        }
    }
}
