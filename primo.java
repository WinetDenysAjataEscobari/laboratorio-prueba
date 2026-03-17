public class VerificadorPrimos {
    public static void main(String[] args) {
        int numero = 29; // Cambia este valor para probar

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int n) {
        // Casos base: números menores o iguales a 1 no son primos
        if (n <= 1) return false;
        
        // El 2 y el 3 son primos
        if (n <= 3) return true;

        // Eliminamos múltiplos de 2 y 3 rápidamente
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Optimizamos buscando divisores hasta la raíz cuadrada de n
        // Usamos el paso de 6 (i = i + 6) basado en la propiedad de que 
        // todos los primos mayores a 3 son de la forma 6k ± 1
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
// hecho por Edward