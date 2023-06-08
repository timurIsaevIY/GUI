import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x=in.nextInt();
        x=-x+1;
        System.out.println(Math.cbrt((-1)*x/2+Math.sqrt(x*x/4+1/27))+Math.cbrt((-x)/2-Math.sqrt(x*x/4+1/27)));
    }
}