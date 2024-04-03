public interface BurgerPart {

}

class JäävuoriSalaatti implements BurgerPart {
    public String toString() {
        return "JäävuoriSalaatti";
    }
}

class Pihvi implements BurgerPart {
    public String toString() {
        return "Pihvi";
    }
}

class Sämpylä implements BurgerPart {
    public String toString() {
        return "Sämpylä";
    }
}
