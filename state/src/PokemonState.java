public abstract class PokemonState {
    
    abstract void isku1(Pokemon pokemon);
    abstract void isku2(Pokemon pokemon);
    abstract void isku3(Pokemon pokemon);

    void kehitys(Pokemon pokemon, PokemonState s) {
        pokemon.changeState(s);
    };
}
