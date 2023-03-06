import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Scanner scan = new Scanner(System.in);

    public int pedirOpcion() {
        System.out.print("Elige una opcion : ");
        int opcion = scan.nextInt();
        scan.nextLine();
        return opcion;
    }

    public double pedirRaddio() {
        System.out.print("Introduzca la longitud del radio : ");
        double radio = scan.nextFloat();
        scan.nextLine();
        return radio;
    }

    public double perimetroCircunferencia(double radio) {
        return 2 * (Math.PI * radio);
    }

    public double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double volumenEsfera(double radio) {
        return (4 * Math.PI) / 3 * Math.pow(radio, 3);
    }

    public double[] todos(double radio) {
        double[] result = new double[3];
        result[0] = perimetroCircunferencia(radio);
        result[1] = areaCirculo(radio);
        result[2] = volumenEsfera(radio);
        return result;
    }

    public void validarOpcion(int opcion, double radio) {
        System.out.println("------Resultado------ ");
        switch (opcion) {
            case 1 -> System.out.println(perimetroCircunferencia(radio));
            case 2 -> System.out.println(areaCirculo(radio));
            case 3 -> System.out.println(volumenEsfera(radio));
            case 4 -> System.out.println(Arrays.toString(todos(radio)));
            default -> {
                System.out.println("\n");
                System.out.println("No tenemos esa opcion!!");
            }
        }
    }

    public void start() {
        int opcion;
        double radio;

        while (true) {
            System.out.println("-----------MENU------------");
            System.out.println("1.Perimetro.");
            System.out.println("2.Area.");
            System.out.println("3.Volumen.");
            System.out.println("4.Todos.");
            System.out.println("5.Salir.");
            opcion = pedirOpcion();
            if (opcion != 5) {
                radio = pedirRaddio();
                validarOpcion(opcion, radio);
            } else break;
        }
    }


    public static void main(String[] args) {
        Main start = new Main();
        start.start();
    }
}