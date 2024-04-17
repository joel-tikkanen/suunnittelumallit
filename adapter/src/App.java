class VanhaJärjestelmä implements vanhaRajapinta {
    public String vanhaToiminto() {
        return "Vanha järjestelmä toimii!";
    }
}


interface vanhaRajapinta  {
    String vanhaToiminto();
}

interface UusiRajapinta {
    String toiminto();
}

class Normitoteutus implements UusiRajapinta {
    @Override
    public String toiminto() {
        return "Uusi järjestelmä toimii normaalisti!";
    }
}

class Adapteri implements UusiRajapinta {
    private vanhaRajapinta vanhaJärjestelmä;

    public Adapteri(vanhaRajapinta vanhaJärjestelmä) {
        this.vanhaJärjestelmä = vanhaJärjestelmä;
    }

    @Override
    public String toiminto() {
        return vanhaJärjestelmä.vanhaToiminto();
    }
}

public class App {
    public static void main(String[] args) {
        vanhaRajapinta vanha = new VanhaJärjestelmä();
        UusiRajapinta adapteri = new Adapteri(vanha);
        UusiRajapinta normaali = new Normitoteutus();

        System.out.println(normaali.toiminto()); 
        System.out.println(adapteri.toiminto()); 
    }
}

