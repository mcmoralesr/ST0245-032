

public class Pos_orden{
    public static void Pos_orden(BinarySearchTree tree){
        Pos_ordenAux(tree.root);
    }

    private static void Pos_ordenAux(Node node){ 
        if(node.left != null){
            Pos_ordenAux(node.left); 
        }
        if(node.right != null){
            Pos_ordenAux(node.right); 
        }
        System.out.println(node.data);
    }

    }
