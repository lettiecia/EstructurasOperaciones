import java.util.Scanner;

class OperacionesBasicas {
    public void Suma() {
        double num1 = 10.5;
        double num2 = 5.2;
        double resultado = num1 + num2;
        System.out.printf("La suma de %.2f y %.2f es: %.5f%n", num1, num2, resultado);
    }

    public void Resta() {
        double num1 = 10.5;
        double num2 = 5.2;
        double resultado = num1 - num2;
        System.out.printf("La resta de %.2f y %.2f es: %.5f%n", num1, num2, resultado);
    }

    public void Multiplicacion() {
        double num1 = 10.5;
        double num2 = 5.2;
        double resultado = num1 * num2;
        System.out.printf("La multiplicación de %.2f y %.2f es: %.5f%n", num1, num2, resultado);
    }

    public void Division() {
        double num1 = 10.5;
        double num2 = 5.2;
        double resultado = num1 / num2;
        System.out.printf("La división de %.2f y %.2f es: %.5f%n", num1, num2, resultado);
    }

    public void Resultado() {
        System.out.println("---- Resultados ----");
        Suma();
        Resta();
        Multiplicacion();
        Division();
        System.out.println("--------------------");
    }
}

class Numeros {
    private final OperacionesBasicas operaciones;

    public Numeros() {
        operaciones = new OperacionesBasicas();
    }

    public void mostrarMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            System.out.println("---- Menú ----");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    operaciones.Suma();
                    break;
                case 2:
                    operaciones.Resta();
                    break;
                case 3:
                    operaciones.Multiplicacion();
                    break;
                case 4:
                    operaciones.Division();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        numeros.mostrarMenu();
    }
}