import java.util.ArrayList;
/**
 * Esta clase es una implementación de un digrafo usando matrices de adyacencia
 * 
 * @author Mauricio Toro, Maria Camila Morales
 * @version 1
 */
public class DigraphAM extends Graph
{
    private int[][] mat; 

    public DigraphAM(int size)
    {
        super(size);
        mat= new int[size][size];
    }

    public int getWeight(int source, int destination)
    {
        return mat[source][destination];
    }

    public void addArc(int source, int destination, int weight)
    {
        mat[source][destination]=weight;
    }

    public ArrayList<Integer> getSuccessors(int vertice)
    {
        ArrayList<Integer> lista=new ArrayList<Integer>();
        for(int i=0;i<size;i++)
            if(mat[vertice][i]>0) 
                lista.add(i);
        return lista;

    }
}