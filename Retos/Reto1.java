import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Reto1{

    /**
     * Mapa para crear un diccionario y su traducción
     */
    Map<String, String> diccionary = new HashMap();
    
    /**
     *Función main para pedir una frase y convertir el mensaje con los nuevos caracteres 
     */
    public static void main(String []args){
        Reto1 reto1 = new Reto1();
        reto1.fillDiccionary();

        System.out.println("Introduce una frase:");
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.println(reto1.convert(message));

        scanner.close();
    }

    /**
     * Función para convertir el mensaje en mayusculas y cambia el caracter key por el su valor
     */
    private String convert(String message){
        message = message.toUpperCase();
        String newMessage = "";
        for(int i = 0; i < message.length(); i++){
            char c = message.charAt(i);
            String ls = this.diccionary.get(c + "");
            
            if(ls != null){
                newMessage += ls;
            }else{
                newMessage += c;
            }
        }
        return newMessage;
    }

    /**
     * Diccionario para poder cambiar los caracteres por los otros
     */
    private void fillDiccionary(){
        diccionary.put("A", "4");
        diccionary.put("B", "I3");
        diccionary.put("C", "[");
        diccionary.put("D", ")");
        diccionary.put("E", "3");
        diccionary.put("F", "|=");
        diccionary.put("G", "&");
        diccionary.put("H", "#");
        diccionary.put("I", "1");
        diccionary.put("J", ",_|");
        diccionary.put("K", ">|");
        diccionary.put("L", "1");
        diccionary.put("M", "/\\/\\");
        diccionary.put("N", "^/");
        diccionary.put("O", "0");
        diccionary.put("P", "|*");
        diccionary.put("Q", "(_,)");
        diccionary.put("R", "I2");
        diccionary.put("S", "5");
        diccionary.put("T", "7");
        diccionary.put("U", "(_)");
        diccionary.put("V", "\\/");
        diccionary.put("W", "\\/\\/");
        diccionary.put("X", "><");
        diccionary.put("Y", "j");
        diccionary.put("Z", "2");
        diccionary.put("1", "L");
        diccionary.put("2", "R");
        diccionary.put("3", "E");
        diccionary.put("4", "A");
        diccionary.put("5", "S");
        diccionary.put("6", "b");
        diccionary.put("7", "T");
        diccionary.put("8", "B");
        diccionary.put("9", "g");
        diccionary.put("0", "o");
    }
}
