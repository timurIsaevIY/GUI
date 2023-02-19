import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        int del=2;
        int m=0;
        while (del*del<=number){
            while(number%del==0){
                System.out.println(del);
                number/=del;
                m=1;
            }
            del+=1;
        }
        if (m==0){
            System.out.println(number);
        }

    }
}