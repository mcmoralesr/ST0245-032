
import java.util.Collection;
import java.util.LinkedList;
public class ejercicio {

    public static void imprimir(LinkedList<Character> car) {
        String cad = "";
        for (int i = 0; i < car.size(); i++)
            cad = cad + car.get(i);
        System.out.println(cad);
    }

    public static void punto2_1(LinkedList<Character> ls, String cad) {
        int j = 0; 
        for (int i = 0; i < cad.length(); i++) { 
            if (cad.charAt(i) == '[')
                j = 0;

            if (cad.charAt(i) == ']')
                j = ls.size();

            if (cad.charAt(i) != '[' && cad.charAt(i) != ']') {
                ls.add(j, cad.charAt(i));
                j++;
            }
        }
        imprimir(ls);
    }

    public static void main(String[] args) {

        LinkedList<Character> ls = new LinkedList<Character>();
        String s = "This_is_a_[Beiju]_text\n"
                + "[[]][][]Happy_Birthday_to_Tsinghua_University\n" + "asd[fgh[jkl"
                +"asd[fgh[jkl[";
        punto2_1(ls, s);

    }

}
