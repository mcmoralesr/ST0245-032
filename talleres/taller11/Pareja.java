import java.util.Objects;
/**
 * Clase Pareja para poder hacer una lista que tenga dos valores en sus nodos
 * 
 * @author Maria Camila Morales
 * @version (a version number or a date)
 */
public class Pareja <P, S>
{
    public final P primero ;
    public final S segundo ;
    public Pareja(P primero, S segundo ){
        this.primero  = primero ;
        this.segundo  = segundo ;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pareja)) {
            return false;
        }
        Pareja<?, ?> p = (Pareja<?, ?>) o;
        return Objects.equals(p.primero , primero ) && Objects.equals(p.segundo , segundo );
    }

    @Override
    public int hashCode() {
        int hashFirst = (primero  == null) ? 0 : primero .hashCode();
        int hashSecond = (segundo  == null) ? 0 : segundo .hashCode();
        return hashFirst ^ hashSecond;
    }

    @Override
    public String toString() {
        return "Pareja{" + String.valueOf(primero ) + " " + String.valueOf(segundo ) + "}";
    }

    public static <A, B> Pareja<A, B> makePareja(A a, B b) {
        return new Pareja<A, B>(a, b);
    }
}