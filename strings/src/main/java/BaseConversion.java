public class BaseConversion {

    /*
    7.2
    */

    public static String baseConversion(String s, int b1, int b2) {
        int passive=s.charAt(0)=='-'?1:0;
        int exp1=0;
        int intVal=0;
        //Chuyen sang base 10
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='-') break;
            int tmpVal=s.charAt(i)>='A'&&s.charAt(i)<='Z'?s.charAt(i)-55:s.charAt(i)-'0';
            intVal+=tmpVal*(int)Math.pow(b1,exp1);
            exp1+=1;
        }
        // Tu 10 sang b2
        StringBuilder res=new StringBuilder();
        if(intVal==0)
            return "0";
        while(intVal!=0){
            int modulo=intVal%b2;
            intVal=intVal/b2;
            res.append(modulo>=10?(char)(modulo+55):(char)(modulo+'0'));
        }
        if(passive==1)
            res.append('-');
        return res.reverse().toString();
    }
}
