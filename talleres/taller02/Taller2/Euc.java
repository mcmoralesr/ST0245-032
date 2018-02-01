
public class Euc{
    //se debe asumir que P es mas grande que Q
    public static int gcd(int p, int q){
        if(q == 0) return p;
        int r= p%q; 
        return gcd(q,r);
    }
}
