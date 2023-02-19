import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        Prism prism= new Prism(a,b,c,d);
        prism.square();
        prism.volume();



    }
}
