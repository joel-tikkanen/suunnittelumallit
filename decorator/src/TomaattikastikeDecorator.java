public class TomaattikastikeDecorator extends PizzaDecorator {

    public TomaattikastikeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTaytteet() {
        return super.getTaytteet() + ", tomaattikastike";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 0.2; 
    }
    
}
