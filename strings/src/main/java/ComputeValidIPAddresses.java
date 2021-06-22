import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class ComputeValidIPAddresses {

    /*
    7.10
    */
    public static boolean checkValidIP(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            count+=str.charAt(i)=='.'?1:0;
        }
        if(count==2)
            return false;
        String[] anotherCheck=str.split(Pattern.quote("."));
        for(int i=0;i<anotherCheck.length;i++){
            if(anotherCheck[i].charAt(0)=='0')
                return false;
            if(Integer.parseInt(anotherCheck[i])<0||Integer.parseInt(anotherCheck[i])>255)
                return false;
        }
        return true;
    }
    public static void generatePermute(List<Integer> perm,int index,String s,List<String>res){
        for(int i=1;i<=3;i++){
            perm.add(i);
            if(perm.size()==3){
                int val1=perm.get(0), val2=perm.get(1)+val1+1, val3=perm.get(2)+val2+1;
                StringBuffer buffer=new StringBuffer(s);
                if(val1<buffer.length()){ buffer.insert(val1,'.'); }
                if(val2<buffer.length()){ buffer.insert(val2,'.'); }
                if(val3<buffer.length()){ buffer.insert(val3,'.'); }
                if(checkValidIP(buffer.toString())){
                    System.out.println(buffer.toString());
                    res.add(buffer.toString());
                }

            }
            else{
                generatePermute(perm,index+1,s,res);
            }
            perm.remove(perm.size()-1);
        }
    }
    public static List<String> computeValidIPAddresses(String s) {
        List<String> res=new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        generatePermute(perm,0,s,res);
        return res;
    }

}
