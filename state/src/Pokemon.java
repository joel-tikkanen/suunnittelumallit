public class Pokemon {

    private PokemonState state;

    public Pokemon(){
        state = Charmander.getInstance();
    }

    protected void changeState(PokemonState s) {
        state = s;
    }

    public void iske() {
        int isku = (int) (Math.random() * 3) + 1;
        switch (isku) {
            case 1:
                state.isku1(this);
                break;
            case 2:
                state.isku2(this);
                break;
            case 3:
                state.isku3(this);
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return state.toString();
    }
        
    
}
