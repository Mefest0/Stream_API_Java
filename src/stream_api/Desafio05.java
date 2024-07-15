package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio05 {
    public static void main(String[] args) {
        //Desafio de calcular à media dos números maiores que 5.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double media = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Média dos números maiores que 5: " + media);
    }
}
