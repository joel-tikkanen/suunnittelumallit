public class App {


    public static void main(String[] args) throws Exception {

        Context context = new Context(new jokainenStrategy());

        context.add("eka");
        context.add("toka");
        context.add("kolmas");

        System.out.println("ensimmäinen strategia:");
        System.out.println(context.toteutaStrategy());

        System.out.println("toinen strategia:");
        context.setStrategy(new jokatoinenStrategy());
        System.out.println(context.toteutaStrategy());


        System.out.println("kolmas strategia:");
        context.setStrategy(new jokaKolmasStrategy());
        System.out.println(context.toteutaStrategy());
    }
}
