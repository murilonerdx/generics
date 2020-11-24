package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("PHP ", "Java ", "C++ ", "C");
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs); //Usando ListaUtil aonde precisa definir Object getUltimo1(List<?> lista), um objeto e (String)
        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(numeros);

        System.out.printf("%s %d", ultimaLinguagem, ultimoNumero);

        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs); //Não precisa passar o tipo, ele já pega o tipo da variavel da frente Strin ultim.....
        Integer ultimoNumero2 = ListaUtil.getUltimo2(numeros);
        System.out.printf("%s %d", ultimaLinguagem2, ultimoNumero2);
        //Também tem como especificar exemplo

        Integer ultimaLinguagem3 = ListaUtil.<Integer>getUltimo2(numeros); //.<Integer>getUltimo2();
    }
}
