import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] test={"12","1234","fff"};
        StringArray s= new StringArray(test);
        for (int i=0;i<20;i++){
            s.stringAdd("1");
            System.out.println(Arrays.toString(s.show()));
        }
        s.stringAdd("1erfervervrev");
        System.out.println(Arrays.toString(s.show()));
        s.stringAdd("1345");
        System.out.println(Arrays.toString(s.show()));

    }
}