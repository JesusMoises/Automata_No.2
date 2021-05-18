/**
 * Autómata No. 2
 * Todas las cadenas con almenos una a
 */
public class main {

    //declaración de cadena 
    public static String cadena;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //establecemos el valor de la cadena a evaluar
        cadena = "bcac";
        //creamos un objeto y mandamos cómo parámetro la cadena que será evaluada
        Automata2 miAut = new Automata2(cadena);
    }//fin del método main

}//fin de la clase main