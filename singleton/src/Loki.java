import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Loki {

    private static Loki instance;

    private File tiedosto;
    private FileWriter kirjoittaja;

    private Loki() {
        tiedosto = new File("lokitiedosto.txt");
        try {
            kirjoittaja = new FileWriter(tiedosto, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  
    public static synchronized Loki getInstance() {
        if (instance == null) {
            instance = new Loki();
        }
        return instance;
    }

    public void virhe(String message) {
        try {
            kirjoittaja.write(String.format("%s ERROR: %s", LocalDateTime.now(), message));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void loki(String message) {
        try {
            kirjoittaja.write(String.format("%s LOG: %s", LocalDateTime.now(), message));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sulje() {
        try {
            if (kirjoittaja != null) {
                kirjoittaja.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
