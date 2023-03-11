//Вычислить n-ое треугольного число
//(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1 ; i <= n; i++){
            sum +=i;
        }
        System.out.print(sum);
    }
}
