public class JuustoDecorator extends PizzaDecorator {

    public JuustoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTaytteet() {
        return super.getTaytteet() + ", juusto";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 1.5;
    }
    
}
