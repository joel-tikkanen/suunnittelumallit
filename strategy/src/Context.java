
import java.util.ArrayList;
import java.util.List;

public class Context {

    private ListConverter strategy;
    private List<String> list;

    public Context(ListConverter strategy) {
        this.strategy = strategy;
        this.list = new ArrayList<String>();
    }

    public void add(String s) {
        this.list.add(s);
    }

    public String toteutaStrategy() {
        return strategy.listToString(this.list);
    }

    public void setStrategy(ListConverter strategy) {
        this.strategy = strategy;
    }
}
