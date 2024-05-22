public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String fazerSom() {
        return "Miau";
    }

    @Override
    public String realizarAcao() {
        return "Está dormindo";
    }
}