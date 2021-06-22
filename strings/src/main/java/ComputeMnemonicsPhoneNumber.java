import java.util.*;
public class ComputeMnemonicsPhoneNumber {

    /*
    7.7
    */
    static Map<Character,String> mp=new HashMap<Character, String>(){
        {
            put('2',"ABC");
            put('3',"DEF");
            put('4',"GHI");
            put('5',"JKL");
            put('6',"MNO");
            put('7',"PQRS");
            put('8',"TUV");
            put('9',"WXYZ");
        }
    };
    /* First thought*/
    public static void backtracking(StringBuilder res,String phoneNumber,int index,List<String>resArr){
        for(int i=0;i<4;i++){
            boolean check=i<=mp.get(phoneNumber.charAt(index)).length()-1;
            res.append(check?mp.get(phoneNumber.charAt(index)).charAt(i):' ');
            if(res.length()==phoneNumber.length()){
                if(res.toString().contains(" ")==false){
                    resArr.add(res.toString());
                }
            }
            else{
                backtracking(res,phoneNumber,index+1,resArr);
            }
            res.deleteCharAt(res.length()-1);
        }
    }
    /* Optimal solution */
    public static void backtrace(StringBuilder res, String phoneNumber, int index, List<String>resArr){
        for(int i=0;i<mp.get(phoneNumber.charAt(index)).length();i++){
            res.append(mp.get(phoneNumber.charAt(index)).charAt(i));
            if(res.length()==phoneNumber.length()){
                resArr.add(res.toString());
            }
            else{
                backtrace(res,phoneNumber,index+1,resArr);
            }
            res.deleteCharAt(res.length()-1);
        }
    }

    public static List<String> computeMnemonics(String phoneNumber) {

        StringBuilder res=new StringBuilder();
        List<String> resArr=new ArrayList<>();

        backtrace(res,phoneNumber,0,resArr);
        return resArr;
    }

}
