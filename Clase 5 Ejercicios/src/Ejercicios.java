import java.util.Scanner;

public class Ejercicios {

    public void calculadoraEdadPerros() {
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro:");
        int edad = cargaDeDatos.nextInt();
        int edadConvertida = edad * 7;
        System.out.println("La edad de su perro convertida a humano es: " + edadConvertida);
    }

    public void millasAKilometros() {
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese una distancia en millas:");
        double millas = cargaDeDatos.nextDouble();
        double millasAKilometros = millas * 1.60934;
        System.out.println("" + millas + " millas equivalen a " + millasAKilometros + "km");
    }

    public void calculadoraDescuento() {
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        double precioOriginal = cargaDeDatos.nextDouble();
        System.out.println("Ahora ingrese el porcentaje de descuento:");
        double porcentaje = cargaDeDatos.nextDouble();
        double precioFinal = precioOriginal - (precioOriginal * porcentaje / 100);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public void calculadoraPropinas() {
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta:");
        double totalCuenta = cargaDeDatos.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar:");
        double pocentajePropina = cargaDeDatos.nextDouble();
        double propina = totalCuenta * (pocentajePropina / 100);
        System.out.println("La propina es: " + propina);
    }

    public void adivinarNumero() {
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numeroIngresado = cargaDeDatos.nextInt();
        int numero = (int) Math.floor(Math.random() * 100);

        if (numeroIngresado == numero) {
            System.out.println("Genial! Adivinaste el número:");
        } else {
            System.out.println("Número incorrecto");
        }
    }
}
