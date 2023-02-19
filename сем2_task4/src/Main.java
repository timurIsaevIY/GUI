import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int number = in.nextInt();
        int d=1,n=1,m=1;
        int z,l=1;
        while (l<=number){
            z=l;
            l=n+m;
            n=z;
            m=l;
            if (l==number){
                System.out.println("Yes");
                d=0;
                break;
            }
        }
        if (d==1 && (number==0 || number==1 || number==2)){
            System.out.println("Yes");
        }
        else if (d==1) {
            System.out.println("NO");
        }
    }
}