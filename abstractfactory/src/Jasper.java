import java.util.ArrayList;

public class Jasper {

    private ArrayList<Vaate> vaatteet = null;

    public void pueVaatteet(Vaatetehdas tehdas) {
        if (vaatteet == null)
            vaatteet = new ArrayList<>();
            vaatteet.add(tehdas.luoLippis());
            vaatteet.add(tehdas.luoPaita());
            vaatteet.add(tehdas.luoFarmarit());
            vaatteet.add(tehdas.luoKengat());
    }


    public void luetteleVaatteetYlpeana(){
        System.out.println("Minulla on tänään päällä: ");
        for (Vaate vaate : vaatteet) {
            System.out.println(vaate);
        }
    }

}
