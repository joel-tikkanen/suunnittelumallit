import java.util.List;

public class jokaKolmasStrategy implements ListConverter{


    // listan läpikäynti for-silmukassa käyttäen List-rajapinnan get-metodia.
    @Override
    public String listToString(List<String> list) {
        String merkkijono = "";
        for (int i = 0; i < list.size(); i++) {
            if (i % 3 == 0) {
                merkkijono += list.get(i) + "\n";
            }
        }
        return merkkijono;
    }
    
}
