import java.util.List;

public class jokatoinenStrategy implements ListConverter {

    // lista taulukoksi ennen läpikäyntiä, joka toteutetaan for-silmukassa

    @Override
    public String listToString(List<String> list) {
        String merkkijono = "";
        String[] taulukko = list.toArray(new String[0]);
        for (int i = 0; i < taulukko.length; i++) {
            if (i % 2 == 0) {
                merkkijono += taulukko[i] + "\n";
            }
        }
        return merkkijono;
    }
    
}
