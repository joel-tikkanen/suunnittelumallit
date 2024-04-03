class McDonaldsBuilder implements BurgerBuilder {
    private StringBuilder burger = new StringBuilder();

    public void buildSämpylä() {
        burger.append(" Sämpylä ");
    }

    public void buildPihvi() {
        burger.append(" Pihvi ");
    }

    public void buildSalaatti() {
        burger.append(" JäävuoriSalaatti ");
    }

    public String getBurger() {
        return burger.toString();
    }
}
