import java.util.Arrays;
import java.util.Comparator;
public class StringArray {
    private String[] strings;
    public StringArray(String[] strings){
        Arrays.sort(strings,(str3, str2) -> str3.length() - str2.length());
        this.strings= new String[strings.length+10];
        System.arraycopy(strings,0,this.strings,this.strings.length-strings.length,strings.length);

    }
    public void stringAdd(String str){
        if (!Arrays.asList(this.strings).contains(null)) {
            expansion();}
            int i = 0;
            while (this.strings[i]==null) {
                i++;
            }
        int index=i;
            while (i<this.strings.length && this.strings[i].length() < str.length() ){
                i++;
            }
            i-=1;
            while(index<i){
                this.strings[index]=this.strings[index+1];
                index++;
            }
            this.strings[i]=str;
    }
    public String getMaxString(){
        return strings[strings.length-1];
    }
    public float getAverageValue(){
        int len=0;
        for (String str : strings){
            len+=str.length();
        }
        return (float)len/strings.length;
    }
    public String[] show(){
        return strings;
    }
    void expansion(){
        String[] q=this.strings;
        this.strings=new String[q.length+10];
        System.arraycopy(q,0,this.strings,10,q.length);
        q=null;
    }
}
