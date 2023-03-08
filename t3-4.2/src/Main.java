public class Main {
    public static void main(String[] args) {
        String[] test={"12","1234","fff"};
        StringArray s= new StringArray(test);
        System.out.println(s.getMaxString());
        System.out.println(s.getAverageValue());
        s.stringAdd("cdnjinvjwvj");
        System.out.println(s.getMaxString());
    }
}