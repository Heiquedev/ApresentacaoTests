package com.mycompany.testesunitarios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class CarrinhoTest {

    public CarrinhoTest() {
    }

    @Test
    @DisplayName("Teste da função que pega a lista de produtos do carrinho, retornando os produtos em forma de 'ArrayList<Produto>'.")
    public void testGetItens() {
        Produto pro = new Produto("Trident", 2.50);
        Carrinho car = new Carrinho();
        car.addItem(pro);
        car.getItens();
    }

    @Test
    @DisplayName("Teste da função que adiciona um produto ao carrinho 'ArrayList<Produto>'. ")
    public void testAddItem() {
        Produto pro = new Produto("Trident", 2.50);
        Carrinho car = new Carrinho();
        car.addItem(pro);
    }

    @Test
    @DisplayName("Teste da função que faz a soma total dos preços (double) dos produtos de um carrinho. Retornando a soma total dos preços.")
    public void testGetTotal() {
        Produto pro = new Produto("Trident", 2.50);
        Carrinho car = new Carrinho();
        car.addItem(pro);
        car.getTotal();
    }

}
