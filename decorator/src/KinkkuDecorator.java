public class KinkkuDecorator extends PizzaDecorator {

    public KinkkuDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getTaytteet() {
        return super.getTaytteet() + ", kinkku";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 1.0;  
    }

}