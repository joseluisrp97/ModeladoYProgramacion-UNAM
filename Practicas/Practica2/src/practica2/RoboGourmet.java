package practica2;

import java.util.Scanner;

import practica2.Restaurante.*;

public class RoboGourmet {

    public static void main(String[] args) {

        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        int opcionElegida = -1;
        System.out.println("BIENVENIDOS A ROBOGOURMET. El lugar donde la tecnología, cocina su alegría!");
        while (opcionElegida != 0) {

            try {
                System.out.println(
                        "\n Que desea hacer?\n1. Encender \n2. Caminar \n3. Atender \n4. Cocinar \n5. Entregar comida\n6. Suspender \n7. Apagar\n0. Salir del programa");

                opcionElegida = scanner.nextInt();

                switch (opcionElegida) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        robot.getModoActual().encender();
                        break;
                    case 2:
                        robot.getModoActual().caminar();
                        break;
                    case 3:
                        robot.getModoActual().atender();
                        break;
                    case 4:
                        robot.getModoActual().cocinar();
                        break;
                    case 5:
                        robot.getModoActual().entregar();
                        break;
                    case 6:
                        robot.getModoActual().suspender();
                        break;
                    case 7:
                        robot.getModoActual().apagar();
                        break;
                    default:
                        System.err.println("POR FAVOR, ELIJA UNA OPCION CORRECTA");
                        break;
                }

            } catch (NumberFormatException e) {
                scanner.next();
            } catch (Exception e) {
                scanner = new Scanner(System.in);
            }
        }
    }
}
