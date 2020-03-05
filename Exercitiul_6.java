
import java.util.Scanner;
public class Exercitiul_6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int aux;
        if(n == 0) {
            System.out.println(a);
        }
        if(n == 1) {
            System.out.println(b);
        }
        if(n > 1) {
            for(int i = 2; i <= n; i++) {
                aux = b;
                b = a + b;
                a = aux;
            }
            System.out.println(a);
        }
    }
}
