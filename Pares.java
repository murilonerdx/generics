package generics;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


public class Pares<C extends Number,V> { //Definindo que C é to tipo Number
    private final Set<Par<C,V>> itens = new HashSet<>(); //Definindo de modo generico c e v para quando forem instanciados, Set adiciona e procura, e hashSet funciona como um organizador de colletions
    public void adicionar(C chave, V valor){ 
        if(chave == null) return; //Vai apenas sair do metodo, se a chave for nula ele apenas sai e não vai para baixo
        Par<C, V> novoPar = new Par<C, V>(chave, valor); //Instanciando par como generico 

        if(itens.contains(novoPar)){ // Ele verifica se contém o numero já dentro de itens, caso sim ele atualiza, removendo o atual e adicionando outro abaixo
            itens.remove(novoPar);
        }
        itens.add(novoPar);
    }

    public V getValor(C chave){
        if(chave == null) return null;
        Optional<Par<C, V>> parOpcional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst(); //Definiu uma novo tipo Optional passando a instancia Par<C,V> e filtrando onde a chave é igual ao primeiro valor
        return parOpcional.isPresent() ? parOpcional.get().getValor() : null; //return ternario, caso parOpcional existir ele vai voltar o valor do primeiro, caso não voltar ele vai retornar nullo
    }
}
