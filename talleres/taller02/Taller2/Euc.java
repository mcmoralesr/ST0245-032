
public class Euc{
    //se debe asumir que A es mas grande que B
    public static int gcd(int p, int q){
        if(q == 0) return p;
        int r= p%q; 
        return gcd(q,r);
    }
}