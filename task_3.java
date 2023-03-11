import java.util.Scanner;

/**
 * task_3
 */
public class task_3 {
       
        public static void main(String[] args) {
            int num1;
            int num2;
            int result;
            char operation;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            num1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            num2 = scanner.nextInt();
            System.out.print("\nВведите операцию(+, -, *, /): ");
            operation = scanner.next().charAt(0);
            switch(operation) {
                case '+': ;
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/': 
                    result = num1 / num2;
                    break;
                default:  System.out.printf("неверная операция\n");
                    return;
            }
            System.out.printf(num1 + " " + operation + " " + num2 + " = " + result + "\n");   

        }
    
}