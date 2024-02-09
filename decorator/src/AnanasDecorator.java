public class AnanasDecorator extends PizzaDecorator {

    public AnanasDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTaytteet() {
        return super.getTaytteet() + ", ananas";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 0.5; 
    }
    
}
