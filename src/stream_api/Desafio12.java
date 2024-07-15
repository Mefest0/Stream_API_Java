package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    //Desafio p/ Encontrar o produto dos números da lista.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produto = numeros.stream()
                .mapToInt(Integer::intValue)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Produto de todos os números: " + produto);
    }
}
