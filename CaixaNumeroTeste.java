package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Integer> caixaA = new CaixaNumero<>(); //Atende apenas a numeros
        caixaA.aguardar(3);
        CaixaNumero<Double> caixaB = new CaixaNumero<>();
        caixaB.aguardar(3.52);
    }
}
