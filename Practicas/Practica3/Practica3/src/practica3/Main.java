package practica3;

import java.util.Scanner;

import practica3.CheemsSoldado.CheemsSoldado;
import practica3.CheemsSoldado.CuartelCheems;
import practica3.armas.*;
import practica3.soldados.*;
import practica3.batallones.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    public static void mostrarMenuEquipar() {
        System.out.println("Seleccione un arma para equipar:");
        System.out.println("1. Armadura de Kevlar");
        System.out.println("2. Armadura de Grafeno");
        System.out.println("3. Armadura de Tanque");
        System.out.println("4. Espada Gigante de Anime");
        System.out.println("5. Pistola de Papas");
        System.out.println("6. Rasho Laser");
        System.out.println("7. Alas de Gallina");
        System.out.println("8. Piernas de Rana Gigante");
        System.out.println("9. Turbinas");
        System.out.println("10. Iron Cheems");
        System.out.println("11. Terminar");
        System.out.print("Elija una opción: ");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Soldado> soldados = new ArrayList<Soldado>();
            CuartelCheems cuartelCheems = new CuartelCheems();
            CheemsSoldado soldadoCheems = cuartelCheems.desplegarCheems();
            CheemsSoldadoAdapter adaptadorCheems = new CheemsSoldadoAdapter(soldadoCheems);

            Batallon batallon = new Batallon();

            while (true) {
                try {
                    System.out.println("----- Menú Principal -----");
                    System.out.println("1. Equipar un nuevo soldado");
                    System.out.println("2. Reportar batallones");
                    System.out.println("3. Equipar a Cheems");
                    System.out.println("4. Salir");
                    System.out.print("Elija una opción: ");
                    int opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            scanner.nextLine();
                            System.out.print("Ingrese el nombre del soldado: ");
                            String nombre = scanner.nextLine();

                            Soldado nuevoSoldado = new Soldado(nombre);
                            soldados.add(nuevoSoldado);

                            int opcionArma;
                            do {
                                mostrarMenuEquipar();
                                opcionArma = scanner.nextInt();
                                Arma arma = null;

                                switch (opcionArma) {
                                    case 1:
                                        arma = new Kevlar();
                                        break;
                                    case 2:
                                        arma = new Grafeno();
                                        break;
                                    case 3:
                                        arma = new Tanque();
                                        break;
                                    case 4:
                                        arma = new EspadaGigante();
                                        break;
                                    case 5:
                                        arma = new PistolaPapas();
                                        break;
                                    case 6:
                                        arma = new RashoLaser();
                                        break;
                                    case 7:
                                        arma = new Alas();
                                        break;
                                    case 8:
                                        arma = new RanaGigante();
                                        break;
                                    case 9:
                                        arma = new Turbinas();
                                        break;
                                    case 10:
                                        arma = new IronCheems();
                                        break;
                                    case 11:
                                        System.out.println("Terminando equipamiento.");
                                        break;
                                    default:
                                        System.out.println("Opción no válida. Intente de nuevo.");
                                }

                                if (arma != null) {
                                    if ("IronCheems".equals(arma.getNombre())
                                            && !"Capitan".equals(nuevoSoldado.getNombreRango())) {
                                        System.out.println("Solo un capitán puede equipar Iron Cheems.");
                                        continue;
                                    }

                                    if (arma instanceof IronCheems && nuevoSoldado.yaTieneIronCheems()) {
                                        System.out.println("Un capitán solo puede equipar una Iron Cheems.");
                                        continue;
                                    }
                                    nuevoSoldado.equiparArma(arma);
                                } else if (opcionArma == 11) {
                                    System.out.println("Terminando equipamiento.");
                                }
                                System.out.println(nuevoSoldado.generarInforme());

                            } while (opcionArma != 11);
                            System.out.println(nuevoSoldado.generarInforme());

                            System.out.println(nuevoSoldado.getNombre() + " equipado con éxito.");
                            break;
                        case 2:
                            scanner.nextLine();
                            System.out.println("----- Menú de Reportes -----");
                            System.out.println("1. Reporte completo");
                            System.out.println("2. Reporte de batallón 1");
                            System.out.println("3. Reporte de batallón 2");
                            System.out.println("4. Reporte de batallón 3");
                            System.out.println("5. Reporte de Cheems");
                            System.out.println("6. Reporte de 1 soldado razo");

                            System.out.println("7. Regresar al menú principal");
                            int tipoReporte = scanner.nextInt();
                            switch (tipoReporte) {
                                case 1:
                                    System.out.println(batallon.generarReporteCompleto());
                                    break;
                                case 2:
                                    System.out.println(batallon.generarReporteBatallon(1));
                                    break;
                                case 3:
                                    System.out.println(batallon.generarReporteBatallon(2));
                                    break;
                                case 4:
                                    System.out.println(batallon.generarReporteBatallon(3));
                                    break;
                                case 5:
                                    scanner.nextLine();
                                    System.out.println("Escriba el nombre del soldado razo");
                                    String nombreSoldado = scanner.next();
                                    System.out.println("Escriba el apellido del soldado razo");
                                    String apellidoSoldado = scanner.next();
                                    System.out.println(
                                            batallon.generarReporteSoldadoRaso(nombreSoldado + " " + apellidoSoldado));
                                    break;
                                case 6:
                                    System.out.println(adaptadorCheems.generarInforme());
                                    break;
                                case 7:
                                    break;
                                default:
                                    System.out.println("Opción no válida. Intente de nuevo.");
                            }

                            break;
                        case 3:

                            int opcionArmaCheems;
                            do {
                                mostrarMenuEquipar();
                                opcionArmaCheems = scanner.nextInt();
                                Arma armaCheems = null;

                                switch (opcionArmaCheems) {
                                    case 1:
                                        armaCheems = new Kevlar();
                                        break;
                                    case 2:
                                        armaCheems = new Grafeno();
                                        break;
                                    case 3:
                                        armaCheems = new Tanque();
                                        break;
                                    case 4:
                                        armaCheems = new EspadaGigante();
                                        break;
                                    case 5:
                                        armaCheems = new PistolaPapas();
                                        break;
                                    case 6:
                                        armaCheems = new RashoLaser();
                                        break;
                                    case 7:
                                        armaCheems = new Alas();
                                        break;
                                    case 8:
                                        armaCheems = new RanaGigante();
                                        break;
                                    case 9:
                                        armaCheems = new Turbinas();
                                        break;
                                    case 11:
                                        System.out.println("Terminando equipamiento de Cheems.");
                                        break;
                                    default:
                                        System.out.println("Opción no válida. Intente de nuevo.");
                                }

                                if (armaCheems != null) {
                                    adaptadorCheems.equiparArma(armaCheems);
                                }

                            } while (opcionArmaCheems != 11);
                            System.out.println(adaptadorCheems.generarInforme());

                            System.out.println("¿A qué batallón deseas agregar a Cheems?");
                            System.out.println("1. Batallón 1");
                            System.out.println("2. Batallón 2");
                            System.out.println("3. Batallón 3");
                            System.out.println("4. No agregar a ningún batallón");
                            System.out.print("Elija una opción: ");
                            int opcionBatallon = scanner.nextInt();

                            if (opcionBatallon >= 1 && opcionBatallon <= 3) {
                                batallon.agregarABatallon(opcionBatallon, adaptadorCheems);
                                System.out.println("Cheems ha sido agregado al batallón " + opcionBatallon);
                            } else if (opcionBatallon == 4) {
                                System.out.println("Cheems no ha sido agregado a ningún batallón.");
                            } else {
                                System.out.println("Opción no válida.");
                            }

                            System.out.println("Cheems equipado con éxito.");
                            break;

                        case 4:
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                            break;
                    }
                } catch (InputMismatchException ime) {
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next(); // Limpia el buffer del scanner
                } catch (Exception e) {
                    System.out.println("Ha ocurrido un error: " + e.getMessage());
                }
            }
        }
    }
}
