public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public String fazerSom() {
        return "Au au";
    }

    @Override
    public String realizarAcao() {
        return " está correndo";
    }
}