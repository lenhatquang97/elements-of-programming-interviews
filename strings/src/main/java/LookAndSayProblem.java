public class LookAndSayProblem {

    /*
    7.8
    */
    public static String lookAndSay(int n) {
        if(n==1)
            return "1";


        int start=0;
        int end=0;
        StringBuilder res=new StringBuilder("1");
        for(int step=2;step<=n;step++){
            StringBuilder first=new StringBuilder(res.toString());
            res.delete(0,res.length()-1);
            for(int i=1;i<first.length();i++){
                if(first.charAt(i)!=first.charAt(start)){
                    end=i-1;
                    int tempCount=end-start+1;
                    res.append(String.valueOf(tempCount)+first.charAt(i));
                    start=i;
                }
            }
            int anotherTemp=first.length()-start;
            res.append(String.valueOf(anotherTemp)+first.charAt(first.length()-1));
        }
        return res.toString();
    }

}
