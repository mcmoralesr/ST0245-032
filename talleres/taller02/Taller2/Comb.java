
public class Comb{
    static void prefijos(char comb[]){
        int n = comb.length;
        for (int i = 0; i < (1<<n); i++){ //bitshifting
            System.out.println("el subconjunto es: ");
            

            for (int j = 0; j < n; j++){
                if ((i & (1 << j)) > 0)
                    System.out.print(comb[j] + "\n" );
                }

            System.out.print("\n");
        }
    }

}