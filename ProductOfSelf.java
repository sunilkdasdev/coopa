
import java.util.Arrays;

public class ProductOfSelf{
    public static int[] product( int[] array){
        int n = array.length;
        int[] finalArr = new int[n];
        int lastVal = 1;
        finalArr[0] = 1;
        for( int i =1; i<n ; i++){
            finalArr[i] = array[i-1] * lastVal;
            lastVal = finalArr[i];

        }
         System.out.print(Arrays.toString(finalArr));
        lastVal = array[n-1];
        for(int i = n-2; i>= 0; i--){
            finalArr[i] = finalArr[i] * lastVal;
            lastVal = array[i] *lastVal;
        }
        return finalArr;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{ 1, 2, 3, 4};
        System.out.print(Arrays.toString(product(arr)));
    }

}