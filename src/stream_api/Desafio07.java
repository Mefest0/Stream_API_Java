package stream_api;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio07 {
    //Desafio para encontrar o segundo número maior da lista.
    public static void main(String[] args) {
        Arrays Arrays = null;
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundoMaior = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println("Segundo número maior da lista: " + segundoMaior);
    }
}

