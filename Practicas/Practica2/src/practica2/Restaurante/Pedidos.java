package practica2.Restaurante;

import java.util.List;
import java.util.Scanner;

/**
 * Clase que almacena los alimentos a ser pedidos.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class Pedidos {

        public static final Scanner scanner = new Scanner(System.in);

        // Listas de platillos para cada tipo de menú
        public static final List<Platillo> LISTA_MENU_GENERAL = List.of(
                        new PlatilloNoVegetariano(1L, "Hamburguesa sencilla", "La vieja confiable", 9.99, true),
                        new PlatilloNoVegetariano(2L, "Hamburguesa hawaiana",
                                        "Ni Lilo y Stitch tenían de estas en Hawái",
                                        13.99, false),
                        new PlatilloNoVegetariano(3L, "Hamburguesa BBQ", "Al puro estilo texano ¡Ajúa!", 13.99,
                                        true));

        public static final List<Platillo> LISTA_MENU_DEL_DIA = List.of(
                        new PlatilloNoVegetariano(4L, "Hamburguesa con tres quesos",
                                        "Esperemos que no seas intolerante a la lactosa", 8.99, false),
                        new PlatilloVegetariano(5L, "Hamburguesa de vegetales",
                                        "Elimina todo lo rico de una hamburguesa y añade vegetales", 5.99, false),
                        new PlatilloNoVegetariano(6L, "Hamburguesa Godzilla",
                                        "Con 5 tipos de carne, ¡no podrás con ella!",
                                        9.99, false));

        public static final List<Platillo> LISTA_MENU_ESPECIAL = List.of(
                        new PlatilloVegetariano(7L, "Hamburguesa de pechuga empanizada", "Nunca es demasiado",
                                        12.99, true),
                        new PlatilloVegetariano(8L, "Hamburguesa de soya",
                                        "Solo la tenemos para cumplir con la inclusión",
                                        19.99, false),
                        new PlatilloNoVegetariano(9L, "Hamburguesa monstruo",
                                        "Incluye de todo, pero al doble. Se puede desbordar",
                                        29.99, true));

        /**
         * Método que solicita un pedido al usuario, pidiendo un ID de platillo.
         * 
         * @param robot Robot que contiene la carta de platillos disponibles.
         * @return El platillo seleccionado por el usuario.
         */
        public static Platillo solicitarPedido(Robot robot) {
                while (true) {
                        try {
                                long id = Long.parseLong(scanner.nextLine());
                                Platillo platillo = robot.getCarta().buscarPlatillo(id);

                                if (platillo != null) {
                                        return platillo;
                                } else {
                                        throw new IllegalArgumentException();
                                }
                        } catch (Exception e) {
                                System.err.println("Elige una opción válida");
                        }
                }
        }
}
