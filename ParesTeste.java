package generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Murilo");
        resultadoConcurso.adicionar(3, "Marcela");
        resultadoConcurso.adicionar(4, "Roberto");
        resultadoConcurso.adicionar(5, "João");
        resultadoConcurso.adicionar(2, "Caroline"); // Sobrescrever a posição
        System.out.println(resultadoConcurso.getValor(1)); // Maria -> 1 lugar
        System.out.println(resultadoConcurso.getValor(2));
    }
}
