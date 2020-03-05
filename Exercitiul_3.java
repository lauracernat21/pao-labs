
import java.util.Scanner;

public class Exercitiul_3
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    
}
