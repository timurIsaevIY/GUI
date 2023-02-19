public class Main {
    public static void main(String[] args) {
        Bank h1= new Bank("h1",1000);
        Bank h2= new Bank("h2",100);
        Bank h3= new Bank("h1",1000);
        h1.recharge(h2,1000);
        System.out.println(h2.getScore());
        h1.mergeAccounts(h2);
        h1.mergeAccounts(h3);
        System.out.println(h1.getScore());
    }
}