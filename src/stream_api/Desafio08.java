package stream_api;
import java.util.Arrays;
import java.util.List;

public class Desafio08 {
    //Desafio para Somar os digitos de todos os números da lista.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .mapToInt(Desafio08::somaDigitos)
                .sum();

        System.out.println("Soma dos dígitos de todos os números: " + somaDigitos);
    }

    private static int somaDigitos(int numero) {
        return String.valueOf(numero).chars().map(Character::getNumericValue).sum();
    }
}

