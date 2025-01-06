package Generics;

import java.util.ArrayList;
import java.util.List;

public class BackPack<TG> {

    private List<TG> itens = new ArrayList<>(); // Inicializa a lista para evitar NullPointerException

    // Adiciona um item à lista
    public void adicionarItens(TG item) { // Ajuste no parâmetro para singular
        itens.add(item); // Adiciona o item à lista
    }

    // Mostra os itens armazenados
    public void mostrarItens() {
        for (TG item : itens) { // Ajuste no nome da variável para singular
            System.out.println(item); // Imprime cada item
        }
    }
}

