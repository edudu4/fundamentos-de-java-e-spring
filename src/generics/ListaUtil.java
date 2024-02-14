package generics;

import java.util.List;

public class ListaUtil {
    public static Object getUltimoSemGenerics(List<?> lista){
        return lista.get(lista.size() - 1);
    }
    public static <T> T getUltimo(List<T> lista){
        return lista.get(lista.size() - 1);
    }
}
