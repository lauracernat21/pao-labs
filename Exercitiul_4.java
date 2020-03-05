
import java.util.Scanner;
public class Exercitiul_4
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial = factorial * i;
        }
    System.out.println(factorial);
    }
    
}
