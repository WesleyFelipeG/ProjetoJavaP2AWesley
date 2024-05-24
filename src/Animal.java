public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String fazerSom();
    public abstract String realizarAcao();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}