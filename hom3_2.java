import java.util.ArrayList;
import java.util.Random;

public class hom3_2 {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Random rand = new Random();
        for (int i= 0; i < 10; i++) {
            list.add(rand.nextInt(10,20));
        }
        System.out.println(list);
        

        boolean chek = false;
        while(!chek){
            chek = true;
            for (int i =0; i< list.size();i++){
                if(list.get(i) % 2 == 0){
                    list.remove(i);
                    chek = false;
                }
            }        
        }
        System.out.println(list);
    }
}
