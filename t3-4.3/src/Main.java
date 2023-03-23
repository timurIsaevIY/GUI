import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] a={1,1};
        int[] b={2,2};
        int[] c={2,2,2};
        Vector vector1 = new Vector(a);
        Vector vector2 = new Vector(b);
        Vector vector_bad = new Vector(c);
        System.out.println(vector1.scalarMultiplication(vector2) + "\n" + Arrays.toString(vector1.multiplication(vector2))+ "\n" + Arrays.toString(vector1.sum(vector2)) + "\n" + Arrays.toString(vector1.difference(vector2))+ "\n" +
        vector1.Length()+ "\n" +
        vector1.corner(vector2)+ "\n" +
        vector1.square(vector2));/*+ "\n" +
        vector1.scalarMultiplication(vector_bad)+ "\n" +
        vector1.multiplication(vector_bad)+ "\n" +
        vector1.sum(vector_bad)+ "\n" +
        vector1.difference(vector_bad)+ "\n" +
        vector1.corner(vector_bad)+ "\n" +
        vector1.square(vector_bad));*/

    }
}