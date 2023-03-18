import java.lang.reflect.Array;

/**
 * hom3_1
 */
public class hom3_1 {

    public static void main(String[] args) {
        int[] array = new int[] {15,78,89,9,12,12546,8,879,16,54,1};
        System.out.println(arrayToString(array));
        array = mergeSort(array);
        System.out.println(arrayToString(array));

    }

    
    public static void merge(int[] src1, int src1start, int[] src2, int src2start, int []dest, int destStart, int size) {
        int index1 = src1start;
        int index2 = src2start;
        
        int src1End = Math.min(src1start + size, src1.length);
        int src2End = Math.min(src2start + size, src2.length);

        int count = src1End - src1start + src2End - src2start;

        for (int i = destStart;i < destStart + count; i++){
            if (index1< src1End && (index2 >= src2End || src1[index1]< src2[index2])){
                dest[i] = src1[index1];
                index1++;
            } else{
                dest[i]= src2[index2];
                index2++;
            }
        }
    }   

    public static int [] mergeSort(int [] array) {
        int [] step;
        int [] currentSrc = array;
        int [] currentDest = new int[array.length];

        int size = 1;
        while (size < array.length){
            for (int i = 0; i< array.length; i += 2 * size){
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            step = currentSrc;
            currentSrc= currentDest;
            currentDest = step;

            size = size * 2;
        }
        return currentSrc;
    }

    private static String arrayToString(int[] array){
        StringBuilder arr = new StringBuilder();
        arr.append("[");
        for (int i = 0; i < array.length; i++){
            if (i > 0){
                arr.append(",");
            }
            arr.append(array[i]);
        }
        arr.append("]");
        return arr.toString();
    }
}