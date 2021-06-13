public class ReverseDigits {

    /*
    5.8
    */

    public static long reverse(int x) {
        int flag=0;
        flag=(x>=0)?0:1;
        x=(x>=0)?x:-x;
        Integer it= Integer.valueOf(x);
        char ch[]=it.toString().toCharArray();
        for(int i=0;i<ch.length/2;i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = temp;
        }
        int res=Integer.parseInt(String.valueOf(ch));
        return (flag==0)?res:-res;
    }
}
