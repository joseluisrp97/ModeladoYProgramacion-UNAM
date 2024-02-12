package practica2.Restaurante;

import java.util.LinkedList;

import practica2.menusIteradores.*;

/**
 * Clase que simula una carta con distintos menús en el restaurante.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class Carta {

    public LinkedList<Menu> menus;

    /**
     * Constructor sin parámetros que inicializa la carta con diferentes tipos de
     * menús.
     */
    public Carta() {
        menus = new LinkedList<>();

        MenuGeneral menuGeneral = new MenuGeneral(Pedidos.LISTA_MENU_GENERAL);
        MenuDelDia menuDelDia = new MenuDelDia(Pedidos.LISTA_MENU_DEL_DIA);
        MenuEspecial menuEspecial = new MenuEspecial(Pedidos.LISTA_MENU_ESPECIAL);

        menus.add(menuGeneral);
        menus.add(menuDelDia);
        menus.add(menuEspecial);

    }

    /**
     * Método que busca un platillo específico en todos los menús del restaurante.
     * 
     * @param id El identificador único del platillo que se busca.
     * @return El platillo encontrado o null si no se encuentra ningún platillo con
     *         el ID proporcionado.
     */
    public Platillo buscarPlatillo(Long id) {
        for (Menu menu : menus) {
            Platillo busqueda = menu.buscarPlatillo(id);
            if (busqueda != null) {
                return busqueda;
            }
        }
        return null;
    }

    /**
     * Método que ofrece una representación en cadena de la carta, concatenando las
     * representaciones en cadena
     * de todos los menús que contiene.
     * 
     * @return Una cadena que representa la totalidad de la carta.
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        for (Menu menu : menus) {
            res.append(menu.toString());
        }

        return res.toString();
    }
}
