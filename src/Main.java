import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Animal leao = new Animal("Leão", "Carnívoro", 190d);
        Animal rouxinol = new Animal("Rouxinol", "Onívoro", 0.20);
        Animal baiacu = new Animal("Baiacu", "Onívoro", 2d);
        Animal cachorro = new Animal("Cachorro caramelo", "Carnívoro", 12d);

        List<Animal> animais = List.of(leao, rouxinol, baiacu, cachorro);

        System.out.println("Animais carnívoros");
        animais.stream()
                .filter(a -> a.getAlimentacao() == "Carnívoro")
                .forEach(System.out::println);

        System.out.println("\nAnimais com peso menor ou igual a 10kg");
        animais.stream()
                .filter(a -> a.getPeso() <= 10)
                .forEach(System.out::println);

        System.out.println("\nAnimais com nome maior ou igual a 5 caracteres");
        animais.stream()
                .filter(a -> a.getNome().length() >= 5)
                .forEach(System.out::println);

        System.out.println("\nAnimais com nome maior ou igual a 5 caracteres com peso maior ou igual a 10kg");
        animais.stream()
                .filter(a -> a.getNome().length() >= 5 && a.getPeso() >= 10)
                .forEach(System.out::println);

        System.out.println("\nAnimais onívoros que pesam menos de 1kg");
        animais.stream()
                .filter(a -> a.getAlimentacao() == "Onívoro" && a.getPeso() < 1)
                .forEach(System.out::println);

    }
}