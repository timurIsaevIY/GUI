public class Main {
    public static void main(String[] args) {
        int numbers[]={0,1,2,3,4,5,6,7,8,9};
        int t=0;
        for (int x : numbers){
            for (int y : numbers){
                for (int z : numbers){
                    for (int m : numbers){
                        for (int n : numbers){
                            for (int k : numbers){
                                if (x+y+z==m+n+k){
                                    t+=1;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(t);
    }
}