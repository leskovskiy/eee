import java.lang.reflect.Array;
import java.util.Arrays;

public class homw2_2 {
    public static void main(String[] args) {
        int [] array = {3,1,6,9,3,5,7,3};
        System.out.println(Arrays.toString(array));
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 1; i<array.length;i++){
                if (array[i]<array[i-1]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array [i-1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        
    }
}
