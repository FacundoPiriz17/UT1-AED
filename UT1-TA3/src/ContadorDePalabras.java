import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ContadorDePalabras {
    /**
     * Cuenta el número de vocales, consonantes y palabras en la frase.
     */
    public int[] cuentaPalabras(String arg) {
        int cuentaVocales = 0;
        int cuentaConsonantes = 0;
        String vocales = "aeiouAEIOU";
        boolean isPalabra = false;
        int contador = 0;
        for (int i = 0; i < arg.length(); i++)
        {
            if (Character.isLetter(arg.charAt(i))){
                isPalabra = true;
                if (vocales.contains(arg.charAt(i) + "")){
                    cuentaVocales++;
                }
                else{
                    cuentaConsonantes++;
                }
            }
            if (arg.charAt(i) == ' ' || i == arg.length()-1)
            {
                if (isPalabra){
                    contador++;
                }
                isPalabra = false;
            }

        }
        return new int[]{cuentaVocales, cuentaConsonantes, contador};
    }

    /**
     * Lee un archivo especificado y agrega el contenido de cada línea a un array de Strings.
     */
    public String[] obtenerLineas(String archivos) {
        FileReader fr = null;
        ArrayList<String> lista = new ArrayList<>();
        int lineasLeidas = 0;
        try {
            fr = new FileReader(archivos);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            /*
             * Mientras no haya llegado al fin del archivo,
             * lee y agrega la línea al array
             */
            while (lineaActual != null) {
                lista.add(lineaActual);
                lineaActual = br.readLine();
                lineasLeidas++;
            }
            return lista.toArray(new String[lista.size()]);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    /**
     * Recibe un array de Strings y cuenta cuántas son palabras
     */
    public int cantPalabras(String[] lineasArchivo) {
        int contador = 0;
        for (int i = 0; i < lineasArchivo.length - 1; i++) {
            if (esPalabra(lineasArchivo[i])) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Obtiene la cantidad de palabras con largo mayor al especificado en el parámetro 'largo'
     */
    public int largoPalabra(String frase, int largo) {
        int contador = 0;
        int longitudPalabra = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (Character.isLetter(letra)) {
                longitudPalabra++;
            }
            else {
                if (longitudPalabra > largo) {
                    contador++;
                }
                longitudPalabra = 0;

            }
        }
        if (longitudPalabra > largo) {
            contador++;
        }
        return contador;
    }

    /**
     * Método auxiliar encargado de verificar
     */
    private boolean esPalabra(String palabra) {
        for (int i =0; i < palabra.length(); i++) {
            if (Character.isLetter(palabra.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Recibe dos vectores de palabras (Strings). Itera sobre la cantidad de palabras que contiene el vector
     */
    public String[] palabrasComunes(String[] palabras1, String[] palabras2)
    {
        ArrayList<String> reps = new ArrayList<>();
        String[] palabras1Separado = separarLineas(palabras1);
        String[] palabras2Separado = separarLineas(palabras2);
        for (String p1 : palabras1Separado) {
            for (String p2 : palabras2Separado) {
                if ((p1.equals(p2)) && (esPalabra(p1)) && (!reps.contains(p1))) {
                    reps.add(p1);
                }
            }
        }

        return reps.toArray(new String[reps.size()]);
    }

    /**
     * Método auxiliar. Recibe un vector de Strings y
     * separa las palabras por espacio
     */
    private String[] separarLineas(String[] lista) {
        ArrayList<String> listaSeparadas = new ArrayList<>();

        for (String linea : lista) {
            String[] lineaSep = linea.split(" ");
            listaSeparadas.addAll(Arrays.asList(lineaSep));
        }
        return listaSeparadas.toArray(new String[listaSeparadas.size()]);
    }
}
