
public class Contador{
    private int contar1; //inicializado en 0
    private String nombreId;

    public Contador(String id){
        nombreId=id;
    }

    public void incrementar(){
        contar1++;
    }

    public int incrementos(){
        return contar1;
    }

    public String toString(){
        return contar1++ + nombreId;
    }
}
