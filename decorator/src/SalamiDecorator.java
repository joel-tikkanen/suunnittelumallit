public class SalamiDecorator extends PizzaDecorator {

    public SalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTaytteet() {
        return super.getTaytteet() + ", salami";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 1; 
    }
}
