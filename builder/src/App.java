public class App {
    public static void main(String[] args) {
        BurgerBuilder hesburger = new HesburgerBuilder();
        BurgerDirector director = new BurgerDirector();
        director.constructHesburgerBurger(hesburger);
        System.out.println(hesburger.getBurger());

        BurgerBuilder mcdonalds = new McDonaldsBuilder();
        director.constructMcDonaldsBurger(mcdonalds);
        System.out.println(mcdonalds.getBurger());
    }
}