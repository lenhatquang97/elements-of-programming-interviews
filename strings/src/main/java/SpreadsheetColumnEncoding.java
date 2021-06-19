public class SpreadsheetColumnEncoding {

    /*
    7.3
    */

    public static int decodeSpreadsheetColumn(String code) {
        int res=0;
        for(int i=0;i<code.length();i++){
            int val=code.charAt(i)-'A';
            res=res*26+val+1;
        }
        return res;
    }


}
