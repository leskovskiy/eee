import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class hom3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Random rand = new Random();
        int sum = 0;
    
        for (int i= 0; i < 10; i++) {
            list.add(rand.nextInt(10,20));
        }
        
        for (int i =0; i< list.size();i++){
            sum = sum + list.get(i);
        } 
        int average = sum / list.size();

        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println("Среднее значение: "  + average);

    }
}
