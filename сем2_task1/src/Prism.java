public class Prism {
    private int a;
    private int b;
    private int c;
    private int d;
    public Prism(int a,int b, int c,int d){
        if ((a+b)>c && (a+c)>b && (b+c)>a && d>0){
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
        }
        else{
            System.out.println("such prizm doesn`t exist");
        }
    }
    public void square(){
        System.out.println(a*d+b*d+c*d);
    }
    public void volume(){
        int p=(a+b+c)/2;
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c))*d);
    }
}
