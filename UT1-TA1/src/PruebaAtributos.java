public class PruebaAtributos {
    int a;
    float b;
    String c;
    //        int 2numbers; Los nombres de las variables no se pueden inicializar con un número.
    //        float clave-de-usuario; Los nombres de las variables pueden contener guiones.
    //        String :pruebaDeNombre; Los nombres de las variables no pueden ser inicializados con simbolos tales como: (: , ; , entre otros)
    public static void main(String[] args) {
        PruebaAtributos test =  new PruebaAtributos();
        System.out.println(test.a); // Imprime 0
        System.out.println(test.b); // Imprime 0.0
        System.out.println(test.c); // Imprime null

        int algo;
        // System.out.println(algo);  La Variable local no está inicializada
    }
}
