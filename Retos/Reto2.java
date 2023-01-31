/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 * 
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.   
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
 */

 import java.util.List;
 import java.util.ArrayList;
import java.util.Arrays;
 

public class Reto2{

    public static int puntosj1 = 0;
    public static int puntosj2 = 0;
    public static void main(String []args){
        List<String> puntos = Arrays.asList("P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1");
        System.out.println("Love - Love");
        if(puntos != null && puntos.size() > 0){
            for(String puntoGanador : puntos){
                punto(puntoGanador);
            }
        }
    }

    public static void punto(String jugador){
        if(jugador == "P1"){
            if(puntosj1 != 30){
                puntosj1 += 15;
            }else{
                puntosj1 += 10;
            }
        }else if(jugador == "P2"){
            if(puntosj2 != 30){
                puntosj2 += 15;
            }else{
                puntosj2 += 10;
            }
        }else{
            System.out.println("\nSe ha recibido un punto que no es de ninguno de los dos jugadores.");
        }

        if(puntosj1 == 40 && puntosj2 == 40){
            System.out.println("Deuce");
        }else if(puntosj1 == 0){
            System.out.println("Love" + "-" + (char)puntosj2);
        }else if(puntosj2 == 0){
            System.out.println((char)puntosj1 + "-" + "Love");
        }else{
            System.out.println((char)puntosj1 + "-" + (char)puntosj2); 
        }
    }
}
