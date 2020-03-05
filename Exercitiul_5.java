
import java.util.Scanner;
public class Exercitiul_5
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean Ok = true;
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                Ok = false;
            }
        }
        if(Ok) {
            System.out.println("Numarul este prim");
        }
        else {
            System.out.println("Numarul nu este prim");
        }
    }   
}
