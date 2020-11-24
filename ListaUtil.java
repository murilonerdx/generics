package generics;

import java.util.List;

public class ListaUtil {
    public static Object getUltimo1(List<?> lista){ //? você não especifica o tipo
        return lista.get(lista.size() - 1);
    }
    public static <T> T getUltimo2(List<T> lista){ //? você não especifica o tipo
        return lista.get(lista.size() - 1);
    }
}
