import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a= in.nextInt(),b=in.nextInt();
        double square=0;
        while (a<b) {
            square+=(Math.pow(a,3)+a+1+Math.pow(a+0.001,3)+a+0.001+1)/2*0.001;
            a+=0.001;
        }
        System.out.println(square);
    }
}