public class TA4 {
    // a) Se imprimirá en consola second string y Third string debido a la posición de los condicionales y las diferentes condiciones.
    public static void main(String[] args) {
        // b)
        int aNumber = 3;
        if (aNumber >= 0)
            if (aNumber == 0) System.out.println("first string");
            else System.out.println("second string");
        System.out.println("Third string");
        // Fue la salida esperada.

        // c) Con saltos de línea
        /*int aNumber = 3;
        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
            else
                System.out.println("second string");
            System.out.println("Third string");*/

        // d) con llaves
        /*
        if (aNumber >= 0){
            if (aNumber == 0)
            {
                System.out.println("first string");
            }
            else {
                System.out.println("second string");
            }
            System.out.println("Third string");
        }*/
    }
}
