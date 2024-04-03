import java.util.ArrayList;

public class HesburgerBuilder implements BurgerBuilder {
    private ArrayList<BurgerPart> burgerParts = new ArrayList<>();

    public void buildSämpylä() {
        burgerParts.add(new Sämpylä());
    }

    public void buildPihvi() {
        burgerParts.add(new Pihvi());
    }

    public void buildSalaatti() {
        burgerParts.add(new JäävuoriSalaatti());
    }

    public ArrayList<BurgerPart> getBurger() {
        return burgerParts;
    }
}
