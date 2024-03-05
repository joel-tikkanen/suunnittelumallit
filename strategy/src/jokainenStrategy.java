import java.util.Iterator;
import java.util.List;

public class jokainenStrategy implements ListConverter {


    // Iteraattorin käyttö

    @Override
    public String listToString(List<String> list) {

        Iterator<String> it = list.iterator();

        String merkkijono = "";

        while (it.hasNext()) {
            merkkijono += it.next() + "\n";
        }

        return merkkijono;
    }
    
}
