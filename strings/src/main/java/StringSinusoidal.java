import java.util.*;

public class StringSinusoidal {

    /*
    7.11
    */

    public static String snakeString(String s) {
        if(s.length()<=1)
            return s;
        Map<Integer,List<Character>> sinud=new HashMap<Integer, List<Character>>(){
            {
                put(0,new ArrayList<Character>());
                put(1,new ArrayList<Character>());
                put(2,new ArrayList<Character>());
            }
        };

        StringBuilder res=new StringBuilder();
        sinud.get(1).add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if((i-1)>=0&&(i-1)%4==0){
                sinud.get(0).add(s.charAt(i));
            }
            else if((i-2)>=0&&(i-2)%2==0){
                sinud.get(1).add(s.charAt(i));
            }
            else{
                sinud.get(2).add(s.charAt(i));
            }
        }
        for(int i=0;i<sinud.get(0).size();i++){
            res.append(sinud.get(0).get(i));
        }
        for(int i=0;i<sinud.get(1).size();i++){
            res.append(sinud.get(1).get(i));
        }
        for(int i=0;i<sinud.get(2).size();i++){
            res.append(sinud.get(2).get(i));
        }
        return res.toString();
    }

}
