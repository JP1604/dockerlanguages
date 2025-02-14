import java.io.*;

public class suma {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        // Realiza la sumatoria
        long resultado = 0;
        for (int i = 1; i <= 10_000_000; i++) {
            resultado += i;
        }

        long end = System.currentTimeMillis();
        long tiempo = end - start;

        // Crea la carpeta 'resultados' si no existe
        File carpeta = new File("resultados");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        // Guarda la suma en resultados/salida.txt
        try (FileWriter resultadoFile = new FileWriter("resultados/salida.txt")) {
            resultadoFile.write(String.valueOf(resultado));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Guarda el tiempo en resultados/resultados.csv
        try (FileWriter tiempoFile = new FileWriter("resultados/resultados.csv", true)) {
            tiempoFile.write("Java," + tiempo + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(tiempo);
    }
}
