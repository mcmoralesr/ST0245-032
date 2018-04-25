import java.util.ArrayList;
import java.util.*;
/**
 * Esta clase es una implementación de un digrafo usando listas de adyacencia
 * 
 * @author Mauricio Toro, Maria Camila Morales
 * @version 1
 */
public class DigraphAL extends Graph
{
    private ArrayList <LinkedList<Pareja<Integer,Integer>>> lista;

    public DigraphAL(int size)
    {
        super(size);
        lista = new ArrayList <LinkedList<Pareja<Integer,Integer>>>();
        for(int i=0; i<size; i++){
            LinkedList <Pareja<Integer,Integer>> lista2 = new LinkedList <Pareja<Integer, Integer>>();
            lista.add(lista2);
        }
    }

    public void addArc(int source, int destination, int weight)
    {
        Pareja <Integer, Integer> pair = new Pareja (destination, weight);
        lista.get(source).add(pair);
    }

    public int getWeight(int source, int destination)
    {
        LinkedList<Pareja<Integer,Integer>> l_inside =lista.get(source);
        Pareja var1=null;
        for(int i=0; i<l_inside.size(); i++){
            var1= l_inside.get(i);
            if ((int)var1.primero==destination)
                break;

        }
        return (int)var1.segundo;
    }

    public ArrayList<Integer> getSuccessors(int vertice)
    {
        ArrayList Successors = new ArrayList<Integer>();
        LinkedList<Pareja<Integer,Integer>> l_inside =lista.get(vertice);
        for(int i=0; i<l_inside.size(); i++){
            Pareja var = l_inside.get(i); 
            if(var!=null){
                int var2 = (int)var.primero;
                Successors.add(var2);
            }else
                break;

        }
        if (Successors.size()==0) return null;
        else
            Collections.sort(Successors);

        return Successors;
    }
}