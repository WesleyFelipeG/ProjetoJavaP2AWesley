public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String fazerSom() {
        return "Miau";
    }

    @Override
    public String realizarAcao() {
        return " está dormindo";
    }
}