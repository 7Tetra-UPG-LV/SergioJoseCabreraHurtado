import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese Un Numero Del 0 Al 1");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 0) {
            return;
        }
        else if (x == 1) {
            System.out.println("Ingrese Un Texto");
            Scanner sc1 = new Scanner(System.in);
            String texto = sc1.nextLine();
            System.out.println("Ingrese Un Texto");
        }
    }
}