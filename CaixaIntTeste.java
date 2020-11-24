package generics;

public class CaixaIntTeste {

    public static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt(); //Tipo inteiro
        caixaA.aguardar(123);

        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
    
}
