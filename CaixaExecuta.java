package generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class CaixaExecuta {
    public static void main(String[] args){ //Generics você não define um tipo para classe, e você pode definir o que quiser
        CaixaTeste<String> caixaA = new CaixaTeste<>();   //Definindo como String
        caixaA.aguardar("Segredo");
        System.out.println(caixaA.abrir());

        CaixaTeste<Integer> caixaB = new CaixaTeste<>(); //Definindo como Integer
        caixaB.aguardar(10);
        System.out.println(caixaB.abrir()); 

        
    }
}
