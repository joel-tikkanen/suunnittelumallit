public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getTaytteet() {
        return pizza.getTaytteet();
    }

    public abstract double getHinta();

}
