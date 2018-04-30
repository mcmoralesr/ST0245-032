
public class Laboratorio5 {
    public static void dibujarArbol(BinaryTree a)
    {
        System.out.println("/* arbolito para http://www.webgraphviz.com/ */"); 
        System.out.println("digraph arbolito {");
        System.out.println("size=\"6,6\";");
        System.out.println("node [color=aquamarine, style=filled];");
        dibujarArbolAux(a.root);
        System.out.println("}");
    }

    public static void dibujarArbolAux(Node nodo)
    {
        if (nodo != null)
        //"x_\n__" -> "xo\n__";
            for(Node n: new Node[] {nodo.left, nodo.right} ){
                if (n != null)
                    System.out.println("\"" + nodo.data + "\" -> \"" + n.data + "\";");
                dibujarArbolAux(n);
            }
    }

    public static void main(String[] args) {
        //Crea el árbol familiar
        BinaryTree Tree = new BinaryTree();
        Node raiz = new Node("Camila");
        Tree.root = raiz;
        Node hijo1 = new Node("Marta");
        raiz.left = hijo1;
        Node hijo2 = new Node("Adonay");
        raiz.right = hijo2;
        Node nieto1 = new Node("Aurora");
        hijo1.left = nieto1;
        Node nieto2 = new Node("Jesus");

        //Altura
        System.out.println(Tree.maxheight());

        //Imprime el árbol familiar
        Tree.recursivePrint();

        //Dibuja el árbol familiar
        dibujarArbol(Tree);

        //buscar abuela

        Tree.AbuelaMaterna("Eustaquia");

    }
}