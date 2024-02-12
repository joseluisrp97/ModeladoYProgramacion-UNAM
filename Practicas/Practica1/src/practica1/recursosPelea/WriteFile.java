package practica1.recursosPelea;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFile {

    /**
     * Usa la clase Files de Java 1.7 para escribir archivos,
     * internamente usa OutputStream.
     * 
     * @author Raya Pérez José Luis
     * @author Jimenez Hernández Allan
     * @author Vazquez Dávila José Adolfo
     * 
     * @param pathname Dirección de salida del archivo
     * @param data     Datos a guardar en el archivo
     */
    public static void writeUsingFiles(String pathname, String data) {
        try {
            Files.write(Paths.get(pathname), data.getBytes());
        } catch (IOException e) {
            createDirectoryIfNeeded(pathname);
            try {
                Files.write(Paths.get(pathname), data.getBytes());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private static void createDirectoryIfNeeded(String pathname) {
        File file = new File(pathname);
        File parentDir = file.getParentFile();
        if (parentDir != null && !parentDir.exists()) {
            parentDir.mkdirs();
        }
    }
}
