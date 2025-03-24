import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContadorDePalabras {

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

    public String[] obtenerLineas(String archivos) {
        FileReader fr = null;
        ArrayList<String> lista = new ArrayList<>();
        int lineasLeidas = 0;
        try {
            fr = new FileReader(archivos);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
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

    public int cantPalabras(String[] lineasArchivo) {
        int contador = 0;
        for (int i = 0; i < lineasArchivo.length - 1; i++) {
            if (esPalabra(lineasArchivo[i])) {
                contador++;
            }
        }
        return contador;
    }

    private boolean esPalabra(String palabra) {
        for (int i =0; i < palabra.length(); i++) {
            if (Character.isLetter(palabra.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
