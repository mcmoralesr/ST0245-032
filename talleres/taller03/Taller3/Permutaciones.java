public class Permutaciones {
    public  static void permutaciones(String s) {
        permut("", s); 
    }

    private static void permut(String base, String s) {
        int n = s.length();
        if (n == 0) System.out.println(base);
        else {
            for (int i = 0; i < n; i++)
                permut(base + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
        }

    }
}