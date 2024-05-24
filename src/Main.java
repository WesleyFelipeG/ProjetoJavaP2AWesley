import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        animais.add(new Cachorro("Bob", 3));
        animais.add(new Gato("Billy", 4));

        boolean continuar = true;
        int resposta;

        while (continuar) {
            System.out.println("----------------------------------------------");
            System.out.println("Digite 1 para registrar um cachorro");
            System.out.println("Digite 2 para registrar um gato");
            System.out.println("Digite 3 para mostrar os animais para adoção");
            System.out.println("Digite 0 para fechar o programa");
            System.out.println("----------------------------------------------");
            resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    registrarCachorro(animais, sc);
                    break;
                case 2:
                    registrarGato(animais, sc);
                    break;
                case 3:
                    mostrarAnimais(animais);
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }

    private static void registrarCachorro(List<Animal> animais, Scanner sc) {
        System.out.println("Digite o nome do cachorro:");
        String nome = sc.next();
        System.out.println("Digite a idade do cachorro:");
        int idade = sc.nextInt();
        animais.add(new Cachorro(nome, idade));
        System.out.println("Cachorro registrado.");
    }

    private static void registrarGato(List<Animal> animais, Scanner sc) {
        System.out.println("Digite o nome do gato:");
        String nome = sc.next();
        System.out.println("Digite a idade do gato:");
        int idade = sc.nextInt();
        animais.add(new Gato(nome, idade));
        System.out.println("Gato registrado.");
    }

    private static void mostrarAnimais(List<Animal> animais) {
        List<Cachorro> cachorros = new ArrayList<>();
        List<Gato> gatos = new ArrayList<>();

        for (Animal animal : animais) {
            if (animal instanceof Cachorro) {
                cachorros.add((Cachorro) animal);
            } else if (animal instanceof Gato) {
                gatos.add((Gato) animal);
            }
        }

        System.out.println("-----------------------" +
                "\nCachorros para adoção:" +
                "\n-----------------------");
        for (Cachorro cachorro : cachorros) {
            System.out.println(cachorro.getNome() + ", " + cachorro.getIdade() + " anos" +
                    "\nO cachorro faz: " + cachorro.fazerSom());
            System.out.println(cachorro.getNome() + cachorro.realizarAcao());
            System.out.println();
        }

        System.out.println("-----------------------" +
                "\nGatos para adoção:" +
                "\n-----------------------");
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + ", " + gato.getIdade() + " anos" +
                    "\nO gato faz: " + gato.fazerSom());
            System.out.println(gato.getNome() + gato.realizarAcao());
            System.out.println();
        }
    }
}