import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Solicitar al usuario el monto de consumo
        System.out.print("Ingrese el monto de consumo en el restaurante: $");
        var montoConsumo = scanner.nextDouble();

        // Calcular descuento según las reglas
        var descuento = 0.0;
        if (montoConsumo > 50 && montoConsumo <= 100) {
            descuento = 0.1; // 10%
        } else if (montoConsumo > 100 && montoConsumo <= 200) {
            descuento = 0.2; // 20%
        } else if (montoConsumo > 200) {
            descuento = 0.3; // 30%
        }


        // Calcular monto final con descuento
        var montoFinal = montoConsumo - (montoConsumo * descuento);

        // Mostrar resumen de la cuenta
        System.out.println("\nResumen de la cuenta:");
        System.out.println("Monto de consumo: $" + montoConsumo);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto final con descuento: $" + montoFinal);

        // Cerrar el scanner
        scanner.close();
    }
}
