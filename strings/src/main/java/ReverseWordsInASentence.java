public class ReverseWordsInASentence {

    /*
    7.6
    */
    public static void reverseSubstring(char[] inp, int left,int right){
        while(left<right){
            char temp=inp[left];
            inp[left]=inp[right];
            inp[right]=temp;
            left++;
            right--;
        }
    }
    public static String reverseWordsInASentence(String input) {
        char[] res=input.toCharArray();
        reverseSubstring(res,0,res.length-1);
        int start=0;
        int end=0;
        for(int i=0;i< res.length;i++){
            if(res[i]==' '){
                end=i-1;
                reverseSubstring(res,start,end);
                start=i+1;
            }
        }
        if(end<=res.length-1)
            reverseSubstring(res,start,res.length-1);
        return String.valueOf(res);
    }
}
