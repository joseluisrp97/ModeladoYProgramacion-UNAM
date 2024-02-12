package practica4;

import java.util.List;
import java.util.Scanner;
import practica4.modelos.Componente;
import practica4.modelos.Nave;
import practica4.modelos.armas.*;
import practica4.modelos.blindajes.*;
import practica4.modelos.cabinas.*;
import practica4.modelos.sistemas.*;
import practica4.modelos.Builder;

/**
 * Clase Imperio en el que se crea e imprime el menu de interfaz con el usuario.
 * Está contenido el método main.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel
 */
public class Imperio {

  private static final Scanner scanner = new Scanner(System.in);

  public static List<Nave> catalogoNaves = List.of(
      new Nave(new ArmaMisilesDePlasma(), new BlindajeSimple(), new CabinaEjercito(), new ViajeInterplanetario()),
      new Nave(new ArmaLaserSimple(), new BlindajeFortaleza(), new Cabina1Piloto(), new ViajeIntergalactico()),
      new Nave(new ArmaLaserDestructorDePlanetas(), new BlindajeReforzado(), new CabinaTripulacionPequena(),
          new ViajeIntercontinental()));

  public static void main(String[] args) {

    System.out.println("BIENVENIDO AL IMPERIO GALÁCTICO\nVamos a construir tu nueva nave para dominar la galaxia");
    double presupuesto = leerPresupuesto();

    while (true) {
      Nave nave = elegirNave();
      double costo = nave.obtenerCosto();

      if (costo > presupuesto) {
        System.out.println("El costo de tu nave sobrepasa tu presupuesto. Deseas... \n"
            + "1. Disenar otra nave. \n"
            + "2. Ver nuestro catalogo?");
        int opcionElegida = leerOpcion(1, 2);
        if (opcionElegida == 2) {
          mostrarCatalogo(presupuesto);
        }
      } else {
        System.out
            .println(
                "Tu nave esta lista para recoger, estas son sus caracteristicas, paga en la caja la cantidad de $"
                    + nave.obtenerCosto() + "\nCaracteristicas:\n" + nave.toString());
        System.exit(0);
      }
    }
  }

  public static double leerPresupuesto() {
    System.out.println("Cual es tu presupuesto?");
    while (true) {
      try {
        return Double.parseDouble(scanner.nextLine());
      } catch (Exception e) {
        System.out.println("Elija una opcion válida");
      }
    }
  }

  public static Nave elegirNave() {
    Builder builder = new Builder();
    builder = builder.arma(
        elegirComponente("Elige un arma", List.of("Laser Simple", "Misiles de Plasma", "Laser Destructor de Planetas"),
            List.of(new ArmaLaserSimple(), new ArmaMisilesDePlasma(), new ArmaLaserDestructorDePlanetas())));
    builder = builder.blindaje(
        elegirComponente("Elige un blindaje", List.of("Blindaje Simple", "Blindaje Reforzado", "Blindaje Fortaleza"),
            List.of(new BlindajeSimple(), new BlindajeReforzado(), new BlindajeFortaleza())));
    builder = builder.cabina(elegirComponente("Elige una cabina",
        List.of("Cabina un Piloto", "Cabina Tripulacion Pequena", "Cabina Ejercito"),
        List.of(new Cabina1Piloto(), new CabinaTripulacionPequena(), new CabinaEjercito())));
    builder = builder.sistemaDePropulsion(elegirComponente("Elige un sistema de propulsion",
        List.of("Sistema de Viaje Intercontinental", "Sistema de Viaje Interplanetario",
            "Sistema de Viaje Intergalactico"),
        List.of(new ViajeIntercontinental(), new ViajeInterplanetario(), new ViajeIntergalactico())));
    return builder.build();
  }

  public static Componente elegirComponente(String mensaje, List<String> opciones, List<Componente> componentes) {
    System.out.println(mensaje);
    for (int i = 0; i < opciones.size(); i++) {
      System.out.println((i + 1) + ". " + opciones.get(i) + " - Precio: $" + componentes.get(i).precio());
    }
    int resp = leerOpcion(1, opciones.size());
    return componentes.get(resp - 1);
  }

  public static int leerOpcion(int min, int max) {
    while (true) {
      try {
        int opcion = Integer.parseInt(scanner.nextLine());
        if (opcion >= min && opcion <= max) {
          return opcion;
        } else {
          System.out.println("Elija una opcion válida");
        }
      } catch (Exception e) {
        System.out.println("Elija una opcion válida");
      }
    }
  }

  public static void mostrarCatalogo(double presupuesto) {
    while (true) {
      long navesImpagables = catalogoNaves.stream().filter(nave -> nave.obtenerCosto() > presupuesto).count();
      if (navesImpagables == catalogoNaves.size()) {
        System.out
            .println("Su presupuesto es muy bajo para alguna de nuestras naves. Retírese y regrese con más capital!");
        System.exit(0);
      } else {
        System.out.println("Elige una nave del catálogo:");
        for (int i = 0; i < catalogoNaves.size(); i++) {
          Nave naveActual = catalogoNaves.get(i);
          System.out.println((i + 1) + ". " + obtenerDescripcionNave(i) + " - Costo: $" + naveActual.obtenerCosto());
        }
        System.out.println((catalogoNaves.size() + 1) + ". Regresar a construir una nave");
        System.out.println((catalogoNaves.size() + 2) + ". Salir del sistema");

        int resp = leerOpcion(1, catalogoNaves.size() + 2);
        if (resp <= catalogoNaves.size()) {
          Nave navesin = catalogoNaves.get(resp - 1);
          if (navesin.obtenerCosto() > presupuesto) {
            System.out.println("Su presupuesto es muy bajo");
          } else {
            System.out.println(
                "Tu nave está lista para recoger, estas son sus características, paga en la caja la cantidad de $"
                    + navesin.obtenerCosto() + "\nCaracterísticas:\n" + navesin.toString());
            System.exit(0);
          }
        } else if (resp == catalogoNaves.size() + 1) {
          return; // Regresar al menú anterior
        } else {
          System.out.println("Gracias por visitar el Imperio Galáctico. ¡Hasta pronto!");
          System.exit(0);
        }
      }
    }
  }

  private static String obtenerDescripcionNave(int index) {
    switch (index) {
      case 0:
        return "Nave individual de combate";
      case 1:
        return "Nave militar de transporte";
      case 2:
        return "Base espacial de guerra";
      default:
        return "Nave desconocida";
    }
  }
}
