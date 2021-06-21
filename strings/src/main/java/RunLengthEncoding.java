import java.util.Collections;

public class RunLengthEncoding {

    /*
    7.12
    */

    public static String encode(String s) {
        StringBuilder res=new StringBuilder();
        if(s.length()==1){
            return '1'+s;
        }
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
                count+=1;
            else{
                res.append(String.valueOf(count)+s.charAt(i-1));
                count=1;
            }
        }
        res.append(String.valueOf(count)+s.charAt(s.length()-1));
        return res.toString();
    }

    public static String decode(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length()/2;i++){
            int val=s.charAt(2*i)-'0';
            for(int k=1;k<=val;k++){
                res.append(s.charAt(2*i+1));
            }}
        return res.toString();
    }

}
