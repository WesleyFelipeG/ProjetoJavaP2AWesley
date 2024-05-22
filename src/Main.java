import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Bob"));
        animais.add(new Gato("Billy"));

        for (Animal animal : animais) {
            System.out.println(animal.getNome() + " faz: " + animal.fazerSom());
            System.out.println(animal.realizarAcao());
            System.out.println();
        }
    }
}