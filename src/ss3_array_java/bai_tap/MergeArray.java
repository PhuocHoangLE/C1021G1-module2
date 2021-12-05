package ss3_array_java.bai_tap;
import java.util.Arrays ;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4} ;
        int[] array2 = {34,5,4} ;
        int[] merge = new int[array1.length + array2.length] ;

        System.arraycopy(array1, 0,merge,0,array1.length);
        System.arraycopy(array2, 0,merge, array1.length, array2.length);

        System.out.println(Arrays.toString(merge));
    }
}
