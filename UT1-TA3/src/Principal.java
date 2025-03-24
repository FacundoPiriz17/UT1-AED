public class Principal {
    public static void main(String[] args) {
        ContadorDePalabras prueba = new ContadorDePalabras();
        int[] prueba1 = prueba.cuentaPalabras("Hola Mundo");
        int[] prueba2 = prueba.cuentaPalabras("Hola 1111");
        int[] prueba3 = prueba.cuentaPalabras("Hola 1AB2");

        for (int i = 0; i < prueba1.length; i++)
        {
            System.out.println(prueba1[i] + " ");
        }

        for (int i = 0; i < prueba2.length; i++)
        {
            System.out.println(prueba2[i] + " ");
        }

        for (int i = 0; i < prueba3.length; i++)
        {
            System.out.println(prueba3[i] + " ");
        }

    }
}
