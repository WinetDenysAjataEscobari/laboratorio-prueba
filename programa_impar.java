import java.util.Scanner;

public class programa_impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 != 0) {
            System.out.println("El número es impar.");
        } else {
            System.out.println("El número no es impar.");
        }

        scanner.close();
    }
}