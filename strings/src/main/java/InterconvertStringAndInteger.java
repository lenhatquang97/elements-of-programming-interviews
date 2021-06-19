public class InterconvertStringAndInteger {

    /*
    7.1
    */

    public static Integer stringToInt(String number) {
        int passive=0;
        int exp=0;
        int res=0;
        if(number.charAt(0)=='-') passive=1;
        for(int i=number.length()-1;i>=0;i--){
            if(number.charAt(i)=='-')
                break;
            res+=(int)((number.charAt(i)-'0')*Math.pow(10,exp));
            exp+=1;
        }
        return passive==1?-res:res;
    }

    public static String intToString(Integer number) {
        if(number==0)
            return "0";
        int passive=0;
        int modulo=0;
        StringBuilder res=new StringBuilder();
        if(number<0){
            passive=1;
            number=-number;
        }
        while(number>0){
            number=number/10;
            modulo=modulo%10;
            res.append((char)(modulo+'0'));
        }
        if(passive==1)
            res.append('-');
        res.reverse();
        return res.toString();
    }

}
