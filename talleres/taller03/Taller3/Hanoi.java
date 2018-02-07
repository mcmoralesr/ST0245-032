
public class Hanoi {

    public void trayectoria(int n, String TorreInicial, String TorreAux, String TorreFinal){
        if(n==1){
            System.out.println("de" + " " +TorreInicial + " "+ "se mueve hacia" + " "+ TorreFinal);
        }else{
            trayectoria(n-1, TorreInicial, TorreFinal, TorreAux);
            System.out.println("de" + " " +TorreInicial + " " +"se mueve hacia" + " "+ TorreFinal);
            trayectoria(n-1,TorreAux,TorreInicial, TorreFinal);
        }
    }
}