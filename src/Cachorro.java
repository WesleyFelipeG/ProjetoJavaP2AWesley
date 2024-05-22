public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String fazerSom() {
        return "Au au";
    }

    @Override
    public String realizarAcao() {
        return "Está correndo";
    }
}