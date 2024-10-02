package stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pessoa {
    public static void main(String[] args) {
        listaDeNomes();
    }

    private static void listaDeNomes() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Adriana - F, Pâmela - F, Karina - F, Beatriz - F, Gonzales - M, Isa - F, Gustavo - M, Felipe - M");

        String[] nomesArray = nomes.get(0).split(", ");

        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        List.of(nomesArray).forEach(nome -> {
            if (nome.toLowerCase().endsWith("- f")) {
                nomesFemininos.add(nome);
            } else if (nome.toLowerCase().endsWith("- m")) {
                nomesMasculinos.add(nome);
            }
        });

        // lambda
        System.out.println("---NOMES FEMININOS---");
        System.out.println(nomesFemininos.stream()
                .collect(Collectors.joining(", ")));

        System.out.println("\n---NOMES MASCULINOS---");
        System.out.println(nomesMasculinos.stream()
                .collect(Collectors.joining(", ")));
    }
}