import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rotate2DArray {

    /*
    6.18
    */
/*
    public static List<List<Integer>> rotateMatrix(List<List<Integer>> squareMatrix) {
        if(squareMatrix.size()<=1){
            return squareMatrix;
        }
        List<List<Integer>> res=new ArrayList<>();
        int siz=squareMatrix.size()-1;
        while(siz>=0){
            List<Integer> tmp=new ArrayList<>(Collections.nCopies(squareMatrix.size(),0));
            res.add(tmp);
            siz-=1;
        }
        for(int i=0;i<squareMatrix.size();i++){
            for(int j=0;j<squareMatrix.size();j++){
                int value=squareMatrix.get(i).get(j);
                res.get(j).set(squareMatrix.size()-i-1,value);
            }
        }
        return res;
    }
 */
    //4 way exchange means 4 angle creating square with 90'
    public static List<List<Integer>> rotateMatrix(List<List<Integer>> squareMatrix) {
        int size=squareMatrix.size();
        for(int i=0;i<=size/2-1;i++){
            for(int j=i;j<=size-2-i;j++){
                //i j -> j size-i -> size-i size-j -> size-j i
                int tmp1=squareMatrix.get(i).get(j);
                int tmp2=squareMatrix.get(j).get(size-1-i);
                int tmp3=squareMatrix.get(size-1-i).get(size-1-j);
                int tmp4=squareMatrix.get(size-1-j).get(i);
                squareMatrix.get(j).set(size-1-i,tmp1);
                squareMatrix.get(size-1-i).set(size-1-j,tmp2);
                squareMatrix.get(size-1-j).set(i,tmp3);
                squareMatrix.get(i).set(j,tmp4);
            }
        }
        return squareMatrix;
    }
}
