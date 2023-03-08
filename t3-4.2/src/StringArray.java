import java.util.Arrays;
import java.util.Comparator;
public class StringArray {
    private String[] strings;
    public StringArray(String[] strings){
        Arrays.sort(strings,(str3, str2) -> str3.length() - str2.length());
        this.strings=strings;
    }
    public void stringAdd(String str){
        String[] str1 = new String [strings.length+1];
        for(int i=0; i<strings.length;i++) {
            str1[i]=strings[i];
        }
        strings = null;
        str1[str1.length-1]=str;
        strings=str1;
        Arrays.sort(strings,(str3, str2) -> str3.length() - str2.length());
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
}
