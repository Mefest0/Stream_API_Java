package stream_api;
import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    //Desafio p/ Encontrar o maior número primo.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorPrimo = numeros.stream()
                .filter(Desafio14::isPrime)
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        System.out.println("Maior número primo da lista: " + maiorPrimo);
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

