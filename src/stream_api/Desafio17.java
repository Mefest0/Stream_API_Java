package stream_api;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {
    //Desafio p/ Filtrar os números primos da lista.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(Desafio17::isPrime)
                .collect(Collectors.toList());

        System.out.println("Números primos da lista: " + numerosPrimos);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
